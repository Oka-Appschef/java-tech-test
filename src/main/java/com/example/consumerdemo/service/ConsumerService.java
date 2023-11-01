package com.example.consumerdemo.service;

import com.example.consumerdemo.DatabaseSeeder;
import com.example.consumerdemo.dto.request.ConsumerRequest;
import com.example.consumerdemo.model.Consumer;
import com.example.consumerdemo.repository.ConsumerJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class ConsumerService {

    @Autowired
    private ConsumerJDBCRepository consumerJDBCRepo;
    @Autowired
    private DatabaseSeeder databaseSeeder;

    public void seedDb(){
        databaseSeeder.generateData();
    }

    public String insertCustomer(ConsumerRequest consumerRequest){
        Consumer newConsumer = new Consumer(consumerRequest.getNama(), consumerRequest.getAlamat(), consumerRequest.getKota(),
                consumerRequest.getProvinsi(),consumerRequest.getTglRegistrasi(), consumerRequest.getStatus());
        Date dateNow = new Date();
        Timestamp timestamp = new Timestamp(dateNow.getTime());
        newConsumer.setTglRegistrasi(timestamp);
        int result  = consumerJDBCRepo.insertData(newConsumer);
        if (result!=0){
            return "Customer inserted successfully";
        }
        return "Customer insertion failed!";
    }

    public List<Consumer> getAllConsumer(){
        return consumerJDBCRepo.findAll();
    }
}

package com.example.consumerdemo.repository;

import com.example.consumerdemo.dto.response.ConsumerRowMapper;
import com.example.consumerdemo.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsumerJDBCRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Consumer> findAll(){
        String sql = "SELECT id,nama,alamat,kota,provinsi,tgl_registrasi,status from konsumen";
        return jdbcTemplate.query(sql,new ConsumerRowMapper());
    }

    public int insertData(Consumer consumer){
        String sql = "INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, consumer.getNama(),consumer.getAlamat(),consumer.getKota(),
                consumer.getProvinsi(), consumer.getTglRegistrasi(), consumer.getStatus());
    }
}

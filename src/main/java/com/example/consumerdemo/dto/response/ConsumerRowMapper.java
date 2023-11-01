package com.example.consumerdemo.dto.response;

import com.example.consumerdemo.model.Consumer;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsumerRowMapper implements ResultSetExtractor<List<Consumer>> {

    @Override
    public List<Consumer> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Consumer> consumers = new ArrayList<>();
        while(rs.next()) {
            Consumer consumer = new Consumer();
            consumer.setId(rs.getInt("id"));
            consumer.setNama(rs.getString("nama"));
            consumer.setAlamat(rs.getString("alamat"));
            consumer.setKota(rs.getString("kota"));
            consumer.setProvinsi(rs.getString("provinsi"));
            consumer.setTglRegistrasi(rs.getTimestamp("tgl_registrasi"));
            consumer.setStatus(rs.getString("status"));
            consumers.add(consumer);
        }
        return consumers;
    }
}

package com.example.consumerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void generateData() {
        initTable();
        insertSeeds();
    }

    public void initTable() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS KONSUMEN");
        jdbcTemplate.execute("CREATE TABLE KONSUMEN(ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT, NAMA VARCHAR(255), ALAMAT TEXT(25), KOTA CHAR(24), " +
                "PROVINSI CHAR(24), TGL_REGISTRASI DATETIME, STATUS CHAR(9))");
    }

    public void insertSeeds() {
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Alex', 'Jl. Telaga No 3', 'Bandar Lampung', 'Lampung', '2017-11-14 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Alexia', 'Jl. Cendrawasih', 'Bandung', 'Jawa Barat', '2017-10-11 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Lina', 'Jl. Mawar', 'Cimahi', 'Jawa Barat', '2017-09-14 00:00:00', 'non-aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Erni', 'Jl. Cut Nyak Dien', 'Medan', 'Sumatra Utara', '2017-09-12 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Anto', 'Jl. Kamboja', 'Bandar Lampung', 'Lampung', '2017-08-14 00:00:00', 'non-aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Maya', 'Jl. Anoa', 'Bandar Lampung', 'Lampung', '2017-08-11 00:00:00', 'non-aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Hadi', 'Jl. Hiu', 'Bogor', 'Jawa Barat', '2017-07-14 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Iwan', 'Jl. Paus', 'Banjarmasin', 'Kalimantan Selatan', '2017-07-14 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Yanti', 'Jl. Barracuda', 'Denpasar', 'Bali', '2017-07-13 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Yanto', 'Jl. Layur', 'Cilacap', 'Jawa Tengah', '2017-06-12 00:00:00', 'non-aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Budi', 'Jl. Tuna', 'Yogyakarta', 'Yogyakarta', '2017-06-11 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Santoso', 'Jl. Tenggiri', 'Banyuwangi', 'Jawa Timur', '2017-05-10 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Cecep', 'Jl. Krapu', 'Malang', 'Jawa Timur', '2017-04-09 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Epul', 'Jl. Bandeng', 'Jepara', 'Jawa Tengah', '2017-03-08 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Sukirjo', 'Jl. Kakap', 'Jakarta Utara', 'Jakarta', '2017-02-07 00:00:00', 'aktif')");
        jdbcTemplate.execute("INSERT INTO Konsumen(nama,alamat,kota,provinsi,tgl_registrasi,status) " +
                "VALUES('Bambang', 'Jl. Dori', 'Jakarta Selatan', 'Jakarta', '2017-02-06 00:00:00', 'aktif')");
    }

    @Override
    public void run(String... args) throws Exception {
        generateData();
    }
}

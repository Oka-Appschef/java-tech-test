package com.example.consumerdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table("KONSUMEN")
public class Consumer {

    @Id
    private Integer id;
    private String nama;
    private String alamat;
    private String kota;
    private String provinsi;
    private Date tglRegistrasi;
    private String status;

    public Consumer() {
    }

    public Consumer(String nama, String alamat, String kota, String provinsi, Date tglRegistrasi, String status) {
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.provinsi = provinsi;
        this.tglRegistrasi = tglRegistrasi;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public Date getTglRegistrasi() {
        return tglRegistrasi;
    }

    public void setTglRegistrasi(Date tglRegistrasi) {
        this.tglRegistrasi = tglRegistrasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

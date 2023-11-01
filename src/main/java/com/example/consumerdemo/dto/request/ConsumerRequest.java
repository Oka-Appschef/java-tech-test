package com.example.consumerdemo.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ConsumerRequest {
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("alamat")
    private String alamat;
    @JsonProperty("kota")
    private String kota;

    @JsonProperty("provinsi")
    private String provinsi;

    @JsonProperty("tgl_registrasi")
    private Date tglRegistrasi;

    @JsonProperty("status")
    private String status;

    public ConsumerRequest() {
    }

    public ConsumerRequest(String nama, String alamat, String kota, String provinsi, Date tglRegistrasi, String status) {
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.provinsi = provinsi;
        this.tglRegistrasi = tglRegistrasi;
        this.status = status;
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

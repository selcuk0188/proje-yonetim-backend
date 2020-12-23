package com.proje.yonetim.model;

import com.proje.yonetim.entities.Proje;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ProjeDto {

    private Integer id;
    private String projeKonusu;
    private Integer dersId;
    private Integer kullaniciId;
    private String sonIslem;
    private String sonIslemTarihi;
    private Integer durum;
    private String tckn;
    private String adiSoyadi;
    private String dersAdi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjeKonusu() {
        return projeKonusu;
    }

    public void setProjeKonusu(String projeKonusu) {
        this.projeKonusu = projeKonusu;
    }

    public Integer getDersId() {
        return dersId;
    }

    public void setDersId(Integer dersId) {
        this.dersId = dersId;
    }

    public Integer getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getSonIslem() {
        return sonIslem;
    }

    public void setSonIslem(String sonIslem) {
        this.sonIslem = sonIslem;
    }

    public String getSonIslemTarihi() {
        return sonIslemTarihi;
    }

    public void setSonIslemTarihi(String sonIslemTarihi) {
        this.sonIslemTarihi = sonIslemTarihi;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }
}

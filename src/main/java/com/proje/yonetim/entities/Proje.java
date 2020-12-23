package com.proje.yonetim.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "proje")
public class Proje {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "proje_konusu")
    private String projeKonusu;

    @Column(name = "ders_id")
    private Integer dersId;

    @Column(name = "kullanici_id")
    private Integer kullaniciId;

    @Column(name = "son_islem")
    private String sonIslem;

    @Column(name = "son_islem_tarihi")
    private String sonIslemTarihi;

    @Column(name = "durum")
    private Integer durum;

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
}

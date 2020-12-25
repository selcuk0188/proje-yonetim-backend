package com.proje.yonetim.entities;


import javax.persistence.*;

@Entity
@Table(name = "kullaniciders")
public class KullaniciDers {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ders_id")
    private Integer dersId;

    @Column(name = "ders_adi")
    private String dersAdi;

    @Column(name = "kullanici_id")
    private Integer kullaniciId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDersId() {
        return dersId;
    }

    public void setDersId(Integer dersId) {
        this.dersId = dersId;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public Integer getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }
}

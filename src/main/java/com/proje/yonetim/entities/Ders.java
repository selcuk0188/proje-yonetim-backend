package com.proje.yonetim.entities;


import javax.persistence.*;

@Entity
@Table(name = "ders")               //ders tablosu ile iliskilendirilen java sınıfı(entity)
public class Ders {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ders_adi")
    private String dersadi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDersadi() {
        return dersadi;
    }

    public void setDersadi(String dersadi) {
        this.dersadi = dersadi;
    }
}

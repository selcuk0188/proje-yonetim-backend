package com.proje.yonetim.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proje_onay")
public class ProjeOnay {

    @Id
    private Integer id;

    @Column(name = "proje_id")
    private Integer projeId;

    @Column(name = "durum")
    private String durum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjeId() {
        return projeId;
    }

    public void setProjeId(Integer projeId) {
        this.projeId = projeId;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}

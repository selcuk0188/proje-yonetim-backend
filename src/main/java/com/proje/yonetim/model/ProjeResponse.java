package com.proje.yonetim.model;

import com.proje.yonetim.entities.Proje;

import java.util.List;

public class ProjeResponse {

    private List<Proje> projeList;

    public List<Proje> getProjeList() {
        return projeList;
    }

    public void setProjeList(List<Proje> projeList) {
        this.projeList = projeList;
    }

}

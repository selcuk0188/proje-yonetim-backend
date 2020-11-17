package com.proje.yonetim.model;

import com.proje.yonetim.entities.ProjeOnay;
import com.proje.yonetim.entities.Rol;

import java.util.List;

public class ProjeOnayResponse {

    private List<ProjeOnay> projeOnayList;

    public List<ProjeOnay> getProjeOnayList() {
        return projeOnayList;
    }

    public void setProjeOnayList(List<ProjeOnay> projeOnayList) {
        this.projeOnayList = projeOnayList;
    }
}

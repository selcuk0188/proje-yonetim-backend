package com.proje.yonetim.model;

import com.proje.yonetim.entities.Proje;

import java.util.List;

public class ProjeListResponse {

    private List<ProjeDto> projeList;

    public List<ProjeDto> getProjeList() {
        return projeList;
    }

    public void setProjeList(List<ProjeDto> projeList) {
        this.projeList = projeList;
    }
}

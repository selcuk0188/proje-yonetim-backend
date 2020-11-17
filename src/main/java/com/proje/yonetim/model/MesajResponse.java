package com.proje.yonetim.model;

import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.entities.Rol;

import java.util.List;

public class MesajResponse {

    private List<Mesaj> mesajList;

    public List<Mesaj> getMesajList() {
        return mesajList;
    }

    public void setMesajList(List<Mesaj> mesajList) {
        this.mesajList = mesajList;
    }
}

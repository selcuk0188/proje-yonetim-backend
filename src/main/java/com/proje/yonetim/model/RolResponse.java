package com.proje.yonetim.model;

import com.proje.yonetim.entities.Proje;
import com.proje.yonetim.entities.Rol;

import java.util.List;

public class RolResponse {

    private List<Rol> rolList;

    public List<Rol> getRolList() {
        return rolList;
    }

    public void setRolList(List<Rol> rolList) {
        this.rolList = rolList;
    }
}

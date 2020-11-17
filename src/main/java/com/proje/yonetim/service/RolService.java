package com.proje.yonetim.service;

import com.proje.yonetim.entities.Ders;
import com.proje.yonetim.entities.Rol;
import com.proje.yonetim.model.DersResponse;
import com.proje.yonetim.model.RolResponse;
import com.proje.yonetim.repository.DersRepository;
import com.proje.yonetim.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public RolResponse getrol() {
        RolResponse response = new RolResponse();
        List<Rol> rolList = rolRepository.findAll();
        response.setRolList(rolList);
        return response;

    }


}

package com.proje.yonetim.controller;


import com.proje.yonetim.model.MesajResponse;
import com.proje.yonetim.model.RolResponse;
import com.proje.yonetim.service.MesajService;
import com.proje.yonetim.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesajController {

    @Autowired
    private MesajService mesajService;

    @RequestMapping(value = "/mesaj", method = RequestMethod.POST)
    public MesajResponse getMesaj() {
        MesajResponse response = new MesajResponse();
        MesajResponse mesajResponse = mesajService.getMesaj();
        response.setMesajList(mesajResponse.getMesajList());
        return response;
    }
}

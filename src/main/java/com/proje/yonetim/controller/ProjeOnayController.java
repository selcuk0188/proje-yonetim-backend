package com.proje.yonetim.controller;


import com.proje.yonetim.entities.ProjeOnay;
import com.proje.yonetim.model.ProjeOnayResponse;
import com.proje.yonetim.model.ProjeResponse;
import com.proje.yonetim.service.ProjeOnayService;
import com.proje.yonetim.service.ProjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjeOnayController {

    @Autowired
    private ProjeOnayService projeOnayService;

    @RequestMapping(value = "/projeonay", method = RequestMethod.POST)
    public ProjeOnayResponse getProjeOnay() {
        ProjeOnayResponse response = new ProjeOnayResponse();
        ProjeOnayResponse projeOnayResponse = projeOnayService.getprojeonay();
        response.setProjeOnayList(projeOnayResponse.getProjeOnayList());
        return response;
    }
}

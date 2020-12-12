package com.proje.yonetim.controller;


import com.proje.yonetim.entities.ProjeOnay;
import com.proje.yonetim.model.ProjeOnayGuncelleResponse;
import com.proje.yonetim.model.ProjeOnayResponse;
import com.proje.yonetim.service.ProjeOnayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjeOnayController {

    @Autowired
    private ProjeOnayService projeOnayService;

    @RequestMapping(value = "/projeOnayListele", method = RequestMethod.POST)
    public ProjeOnayResponse projeOnayListele() {
        return projeOnayService.getProjeOnay();
    }

    @RequestMapping(value = "/projeOnayGuncelle", method = RequestMethod.POST)
    public ProjeOnayGuncelleResponse projeOnayGuncelle(@RequestBody ProjeOnay projeOnay) {
        return projeOnayService.updateProjeOnay(projeOnay);
    }

}

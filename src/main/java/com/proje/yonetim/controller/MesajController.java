package com.proje.yonetim.controller;


import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.model.MesajKayitResponse;
import com.proje.yonetim.model.MesajResponse;
import com.proje.yonetim.service.MesajService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;

@RestController
public class MesajController {

    @Autowired
    private MesajService mesajService;

    @RequestMapping(value = "/mesajListele", method = RequestMethod.POST)
    public MesajResponse mesajListele(@RequestParam("kullaniciId") Integer kullaniciId) {
        return mesajService.getMesajList();
    }

    @RequestMapping(value = "/mesajByKullaniciId", method = RequestMethod.POST)
    public MesajResponse mesajByKullaniciId(@RequestParam("kullaniciId") Integer kullaniciId, @RequestParam("kim") Integer kim) {
        return mesajService.getMesajBykullaniciId(kullaniciId, kim);
    }

    @RequestMapping(value = "/mesajKayit", method = RequestMethod.POST)
    public MesajKayitResponse mesajKayit(@RequestBody Mesaj mesaj) {
        return mesajService.mesajKayit(mesaj);
    }


}

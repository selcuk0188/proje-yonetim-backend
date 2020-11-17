package com.proje.yonetim.controller;


import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.model.KullaniciRequest;
import com.proje.yonetim.model.KullaniciResponse;
import com.proje.yonetim.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KullaniciController {

    @Autowired
    private KullaniciService kullaniciService;

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/kullanici", method = RequestMethod.POST)
    public KullaniciResponse getKullanici(@RequestBody KullaniciRequest request) {
        KullaniciResponse response = new KullaniciResponse();
        //KullaniciResponse kullaniciResponse = kullaniciService.getKullanici(request);
        List<Kullanici> kullaniciList = new ArrayList<>();
        Kullanici kullanici = new Kullanici();
        kullanici.setKullaniciAdi(request.getKullaniciAdi());
        kullanici.setSifre(request.getSifre());
        kullaniciList.addAll(Arrays.asList(kullanici));

        response.setKullaniciList(kullaniciList);
        return response;
    }
}

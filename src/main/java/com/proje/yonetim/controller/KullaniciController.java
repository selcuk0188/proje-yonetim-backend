package com.proje.yonetim.controller;


import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.model.*;
import com.proje.yonetim.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class KullaniciController {

    @Autowired
    private KullaniciService kullaniciService;

    //@CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/kullaniciListele", method = RequestMethod.POST)
    public KullaniciResponse kullaniciListele(@RequestBody KullaniciRequest request) {
        return kullaniciService.getKullaniciList(request);
    }

    @RequestMapping(value = "/kullaniciLogin", method = RequestMethod.POST)
    public LoginKullaniciResponse kullaniciLogin(@RequestParam("kullaniciAdi") String kullaniciAdi, @RequestParam("sifre") String sifre) {
        return kullaniciService.getKullanici(kullaniciAdi, sifre);
    }

    @RequestMapping(value = "/kullaniciKayit", method = RequestMethod.POST)
    public KullaniciKayitResponse kullaniciKayit(@RequestBody Kullanici kullanici) {
        return kullaniciService.saveKullanici(kullanici);
    }

    @RequestMapping(value = "/kullaniciGuncelle", method = RequestMethod.POST)
    public KullaniciGuncelleResponse kullaniciGuncelle(@RequestBody Kullanici kullanici) {
        return kullaniciService.updateKullanici(kullanici);
    }

    @RequestMapping(value = "/kullaniciSil", method = RequestMethod.POST)
    public KullaniciSilResponse kullaniciSil(@RequestParam("kullaniciId") Integer kullaniciId) {
        return kullaniciService.deleteKullanici(kullaniciId);
    }
}

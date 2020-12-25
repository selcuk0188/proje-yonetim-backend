package com.proje.yonetim.controller;


import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.entities.KullaniciDers;
import com.proje.yonetim.entities.KullaniciDersResponse;
import com.proje.yonetim.model.*;
import com.proje.yonetim.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class KullaniciController {

    @Autowired
    private KullaniciService kullaniciService;

    @RequestMapping(value = "/kullaniciListele", method = RequestMethod.POST)      // Rol Id ve Kullanici Id'sine göre kullanicilari listeler
    public KullaniciListProjeResponse kullaniciListele(@RequestParam("rolId") Integer rolId, @RequestParam("kullaniciId") Integer kullaniciId) {
        return kullaniciService.getKullaniciList(rolId, kullaniciId);
    }

    @RequestMapping(value = "/kullaniciById", method = RequestMethod.POST)           // Kullanici Id'sine göre kullanicilari listeler
    public KullaniciByIdResponse getKullaniciById(@RequestParam("kullaniciId") Integer kullaniciId) {
        return kullaniciService.getKullaniciById(kullaniciId);
    }

    @RequestMapping(value = "/kullaniciListeleHepsi", method = RequestMethod.POST)  // Kullanicilarin hepsini listeler
    public KullaniciResponse kullaniciListele() {
        return kullaniciService.getKullaniciList();
    }

    @RequestMapping(value = "/kullaniciListeleByRol", method = RequestMethod.POST)   // Kullanicilari rol id'sine göre listeler
    public KullaniciResponse kullaniciListeleByRol(@RequestParam("rolId") Integer rolId) {
        return kullaniciService.getKullaniciList(rolId);
    }

    @RequestMapping(value = "/kullaniciLogin", method = RequestMethod.POST) // Kullanicilarin login kontrolünü yapıp kullanici bilgilerini döner
    public LoginKullaniciResponse kullaniciLogin(@RequestParam("tckn") String tckn, @RequestParam("sifre") String sifre) {
        return kullaniciService.getKullanici(tckn, sifre);
    }

    @RequestMapping(value = "/kullaniciKayit", method = RequestMethod.POST)     // kullanicinin kayit edilmesini sağlar
    public KullaniciKayitResponse kullaniciKayit(@RequestBody Kullanici kullanici) {
        return kullaniciService.saveKullanici(kullanici);
    }

    @RequestMapping(value = "/kullaniciDersKayit", method = RequestMethod.POST)// kullanicinin ders ile iliskilendirilmesini sağlar
    public KullaniciKayitResponse kullaniciKayit(@RequestBody KullaniciDers kullaniciDers) {
        return kullaniciService.saveKullaniciDers(kullaniciDers);
    }

    @RequestMapping(value = "/kullaniciGuncelle", method = RequestMethod.POST) // kullanici bilgilerine göre kullaniciyi günceller
    public KullaniciGuncelleResponse kullaniciGuncelle(@RequestBody Kullanici kullanici) {
        return kullaniciService.updateKullanici(kullanici);
    }

    @RequestMapping(value = "/kullaniciSil", method = RequestMethod.POST) ) // kullanici id'sine göre kullaniciyi siler
    public KullaniciSilResponse kullaniciSil(@RequestParam("kullaniciId") Integer kullaniciId) {
        return kullaniciService.deleteKullanici(kullaniciId);
    }

    @RequestMapping(value = "/kullaniciDersListele", method = RequestMethod.POST) // kullanici ders iliskisini listeler
    public KullaniciDersResponse kullaniciDersListele() {
        return kullaniciService.getKullaniciDersList();
    }
}

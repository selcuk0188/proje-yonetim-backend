package com.proje.yonetim.controller;


import com.proje.yonetim.entities.Proje;
import com.proje.yonetim.model.ProjeKayitResponse;
import com.proje.yonetim.model.ProjeListResponse;
import com.proje.yonetim.service.ProjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProjeController {

    @Autowired
    private ProjeService projeService;

    @RequestMapping(value = "/projeListele", method = RequestMethod.POST)       // kullanici idsine göre projeleri listeler
    public ProjeListResponse projeListele(@RequestParam("kullaniciId") Integer kullaniciId) {
        return projeService.getProjeList(kullaniciId);
    }


    @RequestMapping(value = "/projeBykullaniciId", method = RequestMethod.POST)  // kullanici idsine göre projeleri listeler
    public ProjeListResponse projeBykullaniciId(@RequestParam("kullaniciId") Integer kullaniciId) {
        return projeService.getProjeBykullaniciId(kullaniciId);
    }

    @RequestMapping(value = "/projeKaydet", method = RequestMethod.POST)  // projenin kaydedilmesini sağlar
    public ProjeKayitResponse projeKaydet(@RequestBody Proje proje) {
        return projeService.saveProje(proje);
    }
    
    @RequestMapping(value = "/projeAta", method = RequestMethod.POST)        // projenin öğrenciye atanmasını sağlar
    public ProjeKayitResponse projeAta(@RequestParam("projeKonusu") String projeKonusu,
                                       @RequestParam("kullaniciId") Integer kullaniciId,
                                       @RequestParam("dersId") Integer dersId) {
        return projeService.assignProje(projeKonusu, kullaniciId, dersId);
    }

    @RequestMapping(value = "/projeDurumGuncelle", method = RequestMethod.POST)  // projenin durumunu gunceller
    public ProjeKayitResponse projeKaydet(@RequestParam("projeId") Integer projeId) {
        return projeService.updateProje(projeId);
    }

}

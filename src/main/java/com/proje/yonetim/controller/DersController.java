package com.proje.yonetim.controller;


import com.proje.yonetim.entities.Ders;
import com.proje.yonetim.model.DersKayitResponse;
import com.proje.yonetim.model.DersResponse;
import com.proje.yonetim.service.DersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController                                                         // REST API
public class DersController {                                           // Önyüzün isteğinin ilk geldiği katman

    @Autowired
    private DersService dersService;

    @RequestMapping(value = "/dersListele", method = RequestMethod.POST) // Tüm dersleri önyüze döner
    public DersResponse dersListele() {
        return dersService.getDers();                                    // Listelemek için servis katmanını çağırır
    }

    @RequestMapping(value = "/dersKaydet", method = RequestMethod.POST) // Önyüzden gelen derslerin kaydedilmesini sağlar
    public DersKayitResponse dersKaydet(@RequestBody Ders ders) {
        return dersService.saveDers(ders);                              // Kayıt için servis katmanını çağırır
    }

}

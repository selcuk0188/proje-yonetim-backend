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

@RestController
public class DersController {

    @Autowired
    private DersService dersService;

    @RequestMapping(value = "/dersListele", method = RequestMethod.POST)
    public DersResponse dersListele() {
        return dersService.getDers();
    }

    @RequestMapping(value = "/dersKaydet", method = RequestMethod.POST)
    public DersKayitResponse dersKaydet(@RequestBody Ders ders) {
        return dersService.saveDers(ders);
    }

}

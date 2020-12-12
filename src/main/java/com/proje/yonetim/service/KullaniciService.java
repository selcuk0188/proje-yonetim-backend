package com.proje.yonetim.service;

import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.model.*;
import com.proje.yonetim.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KullaniciService {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    public KullaniciResponse getKullaniciList(KullaniciRequest request) {
        KullaniciResponse response = new KullaniciResponse();
        List<Kullanici> kullaniciList = kullaniciRepository.findAll();
        response.setKullaniciList(kullaniciList);
        return response;

    }

    public LoginKullaniciResponse getKullanici(String kullaniciAdi, String sifre) {
        LoginKullaniciResponse response = new LoginKullaniciResponse();
        Kullanici kullanici = kullaniciRepository.findByKullaniciAdiAndSifre(kullaniciAdi, sifre);
        response.setKullanici(kullanici);
        return response;
    }

    public KullaniciKayitResponse saveKullanici(Kullanici kullanici) {
        KullaniciKayitResponse kullaniciKayitResponse = new KullaniciKayitResponse();
        kullaniciRepository.save(kullanici);
        kullaniciKayitResponse.setBasariliMi(true);
        return kullaniciKayitResponse;
    }


    public KullaniciGuncelleResponse updateKullanici(Kullanici kullanici) {
        KullaniciGuncelleResponse kullaniciGuncelleResponse = new KullaniciGuncelleResponse();
        if (kullanici != null) {
            Optional<Kullanici> kullanici_ = kullaniciRepository.findById(kullanici.getId());
            kullanici_.get().setKullaniciAdi(kullanici.getKullaniciAdi());
            kullanici_.get().setRol(kullanici.getRol());
            kullanici_.get().setAdSoyad(kullanici.getAdSoyad());
            kullanici_.get().setDurum(kullanici.getDurum());
            kullanici_.get().setSifre(kullanici.getSifre());
            kullanici_.get().setTcNo(kullanici.getTcNo());
            kullaniciRepository.save(kullanici_.get());
        }
        kullaniciGuncelleResponse.setBasariliMi(true);
        return kullaniciGuncelleResponse;
    }

    public KullaniciSilResponse deleteKullanici(Integer kullaniciId) {
        KullaniciSilResponse kullaniciKayitResponse = new KullaniciSilResponse();
        Optional<Kullanici> kullanici_ = kullaniciRepository.findById(kullaniciId);
        if (kullanici_.isPresent()) {
            kullanici_.get().setDurum("PASIF");
            kullaniciRepository.save(kullanici_.get());
        }
        kullaniciKayitResponse.setBasariliMi(true);
        return kullaniciKayitResponse;
    }

}

package com.proje.yonetim.service;

import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.entities.Proje;
import com.proje.yonetim.model.*;
import com.proje.yonetim.repository.KullaniciRepository;
import com.proje.yonetim.repository.ProjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class KullaniciService {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @Autowired
    private ProjeRepository projeRepository;


    public KullaniciListProjeResponse getKullaniciList(Integer rolId,Integer dersId) {
        KullaniciListProjeResponse response = new KullaniciListProjeResponse();
        List<Kullanici> kullaniciList = kullaniciRepository.findByRolId(rolId);
        List<KullaniciListProje> kullaniciListProjeList = kullaniciList.stream().map(e -> convertKullanici(e,rolId,dersId)).collect(Collectors.toList());
        response.setKullaniciList(kullaniciListProjeList);
        return response;

    }

    private KullaniciListProje convertKullanici(Kullanici kullanici, Integer rolId, Integer dersId) {
        KullaniciListProje kullaniciListProje = new KullaniciListProje();
        kullaniciListProje.setKullaniciAdi(kullanici.getKullaniciAdi());
        kullaniciListProje.setId(kullanici.getId());
        kullaniciListProje.setDurum(kullanici.getDurum());
        kullaniciListProje.setSifre(kullanici.getSifre());
        kullaniciListProje.setAdSoyad(kullanici.getAdSoyad());
        kullaniciListProje.setTcNo(kullanici.getTcNo());
        if (rolId == 1) {
            Proje proje = projeRepository.findByKullaniciIdAndDersId(kullanici.getId(), dersId);
            kullaniciListProje.setProje(proje==null ? new Proje() : proje);
        }
        return kullaniciListProje;
    }


    public KullaniciByIdResponse getKullaniciById(Integer kullaniciId) {
        KullaniciByIdResponse response = new KullaniciByIdResponse();
        Optional<Kullanici> kullanici = kullaniciRepository.findById(kullaniciId);
        if (kullanici.isPresent())
            response.setKullanici(kullanici.get());
        return response;

    }

    public KullaniciResponse getKullaniciList() {
        KullaniciResponse response = new KullaniciResponse();
        List<Kullanici> kullaniciList = kullaniciRepository.findAll();
        response.setKullaniciList(kullaniciList);
        return response;

    }

    public LoginKullaniciResponse getKullanici(String tckn, String sifre) {
        LoginKullaniciResponse response = new LoginKullaniciResponse();
        Kullanici kullanici = kullaniciRepository.findByTcNoAndSifre(tckn, sifre);
        if (kullanici == null) {
            response.setBasariliMi(false);
        }
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
            //kullanici_.get().setRol(kullanici.getRol());
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

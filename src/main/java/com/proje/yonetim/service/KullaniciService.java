package com.proje.yonetim.service;

import com.proje.yonetim.entities.*;
import com.proje.yonetim.model.*;
import com.proje.yonetim.repository.DersRepository;
import com.proje.yonetim.repository.KullaniciDersRepository;
import com.proje.yonetim.repository.KullaniciRepository;
import com.proje.yonetim.repository.ProjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class KullaniciService {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @Autowired
    private ProjeRepository projeRepository;

    @Autowired
    private KullaniciDersRepository kullaniciDersRepository;

    @Autowired
    private DersRepository dersRepository;


    public KullaniciListProjeResponse getKullaniciList(Integer rolId, Integer kullaniciId) {
        KullaniciListProjeResponse response = new KullaniciListProjeResponse();
        List<KullaniciListProje> result = new ArrayList<>();
        List<KullaniciDers> byKullaniciId = kullaniciDersRepository.findByKullaniciId(kullaniciId);
        for (KullaniciDers kullaniciDers : byKullaniciId) {
            List<KullaniciDers> byDersId = kullaniciDersRepository.findByDersId(kullaniciDers.getDersId());
            for (KullaniciDers ld : byDersId) {
                if (!ld.getKullaniciId().equals(kullaniciId)) {
                    Optional<Kullanici> byId = kullaniciRepository.findById(ld.getKullaniciId());
                    result.add(convertKullanici(byId.get(), rolId, ld.getDersId(), ld.getDersAdi()));
                }
            }
        }
        response.setKullaniciList(result);
        return response;
    }

    public KullaniciResponse getKullaniciList(Integer rolId) {
        KullaniciResponse response = new KullaniciResponse();
        List<Kullanici> byRolId = kullaniciRepository.findByRolId(rolId);
        response.setKullaniciList(byRolId);
        return response;
    }

    private KullaniciListProje convertKullanici(Kullanici kullanici, Integer rolId, Integer dersId, String dersAdi) {
        KullaniciListProje kullaniciListProje = new KullaniciListProje();
        kullaniciListProje.setKullaniciAdi(kullanici.getKullaniciAdi());
        kullaniciListProje.setId(kullanici.getId());
        kullaniciListProje.setDurum(kullanici.getDurum());
        kullaniciListProje.setSifre(kullanici.getSifre());
        kullaniciListProje.setAdSoyad(kullanici.getAdSoyad());
        kullaniciListProje.setTcNo(kullanici.getTcNo());
        kullaniciListProje.setDersId(dersId);
        kullaniciListProje.setDersAdi(dersAdi);
        if (rolId == 1) {
            List<Proje> p = projeRepository.findByKullaniciIdAndDersId(kullanici.getId(), dersId);
            kullaniciListProje.setProje((p == null || p.isEmpty()) ? new Proje() : p.get(0));
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

    public KullaniciDersResponse getKullaniciDersList() {
        KullaniciDersResponse response = new KullaniciDersResponse();
        List<KullaniciDers> kullaniciDersList = kullaniciDersRepository.findAll();
        List<KullaniciDersList> kullaniciDersListList = kullaniciDersList.stream().map(e -> convert(e)).collect(Collectors.toList());
        response.setKullaniciDersList(kullaniciDersListList);
        return response;

    }

    private KullaniciDersList convert(KullaniciDers kullaniciDers) {
        KullaniciDersList kullaniciDersList = new KullaniciDersList();
        kullaniciDersList.setKullaniciId(kullaniciDers.getKullaniciId());
        kullaniciDersList.setDersId(kullaniciDers.getDersId());
        kullaniciDersList.setId(kullaniciDers.getId());
        kullaniciDersList.setDersAdi(kullaniciDers.getDersAdi());
        Optional<Kullanici> byId = kullaniciRepository.findById(kullaniciDers.getKullaniciId());
        if (byId.isPresent()) {
            kullaniciDersList.setKullaniciAdSoyad(byId.get().getAdSoyad());
            if (byId.get().getRolId() == 1)
                kullaniciDersList.setKullaniciRol("Öğrenci");
            else if (byId.get().getRolId() == 2)
                kullaniciDersList.setKullaniciRol("Öğretmen");
        }
        return kullaniciDersList;
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
        return kullaniciKayitResponse;
    }

    public KullaniciKayitResponse saveKullaniciDers(KullaniciDers kullaniciDers) {
        KullaniciKayitResponse kullaniciKayitResponse = new KullaniciKayitResponse();
        Optional<Ders> dersAdi = dersRepository.findById(kullaniciDers.getDersId());
        if (dersAdi.isPresent())
            kullaniciDers.setDersAdi(dersAdi.get().getDersadi());
        kullaniciDersRepository.save(kullaniciDers);
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
            kullaniciRepository.deleteById(kullaniciId);
        }
        kullaniciKayitResponse.setBasariliMi(true);
        return kullaniciKayitResponse;
    }

}

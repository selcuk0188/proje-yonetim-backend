package com.proje.yonetim.service;

import com.proje.yonetim.entities.Ders;
import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.entities.Proje;
import com.proje.yonetim.model.ProjeDto;
import com.proje.yonetim.model.ProjeKayitResponse;
import com.proje.yonetim.model.ProjeListResponse;
import com.proje.yonetim.repository.DersRepository;
import com.proje.yonetim.repository.KullaniciRepository;
import com.proje.yonetim.repository.ProjeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjeService {

    @Autowired
    private ProjeRepository projeRepository;

    @Autowired
    private KullaniciRepository kullaniciRepository;


    @Autowired
    private DersRepository dersRepository;

    public ProjeListResponse getProjeList() {
        ProjeListResponse response = new ProjeListResponse();
        List<Proje> projeList = projeRepository.findAll();
        List<ProjeDto> projeDtoList = projeList.stream().map(e -> getProjeDto(e)).collect(Collectors.toList());
        response.setProjeList(projeDtoList);
        return response;

    }

    private ProjeDto getProjeDto(Proje proje) {
        ProjeDto projeDto = new ProjeDto();
        projeDto.setId(proje.getId());
        projeDto.setDurum(proje.getDurum());
        projeDto.setDersId(proje.getDersId());
        projeDto.setKullaniciId(proje.getKullaniciId());
        projeDto.setSonIslemTarihi(proje.getSonIslemTarihi());
        projeDto.setProjeKonusu(proje.getProjeKonusu());
        projeDto.setKullaniciId(proje.getKullaniciId());
        projeDto.setSonIslem(proje.getSonIslem());
        Optional<Kullanici> kullanici = kullaniciRepository.findById(proje.getKullaniciId());
        if (kullanici.isPresent()) {
            projeDto.setAdiSoyadi(kullanici.get().getAdSoyad());
            projeDto.setTckn(kullanici.get().getTcNo());
        }
        return projeDto;
    }

    private String formattedDate() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        return myDateObj.format(myFormatObj);
    }

    public ProjeListResponse getProjeBykullaniciId(Integer kullaniciId) {
        ProjeListResponse response = new ProjeListResponse();
        List<Proje> projeList = projeRepository.findByKullaniciId(kullaniciId);
        if (projeList != null) {
            List<ProjeDto> projeDtoList = projeList.stream().map(e -> convertToProjeDto(e)).collect(Collectors.toList());
            response.setProjeList(projeDtoList);
        }
        return response;

    }

    private ProjeDto convertToProjeDto(Proje proje) {
        ProjeDto projeDto = new ProjeDto();
        Optional<Ders> ders = dersRepository.findById(proje.getDersId());
        projeDto.setDersAdi(ders.isPresent() ? ders.get().getDersadi() : "-");
        projeDto.setSonIslemTarihi(proje.getSonIslemTarihi());
        projeDto.setProjeKonusu(proje.getProjeKonusu());
        projeDto.setDurum(proje.getDurum());
        projeDto.setSonIslem(proje.getSonIslem());
        projeDto.setKullaniciId(proje.getKullaniciId());
        projeDto.setDersId(proje.getDersId());
        projeDto.setId(proje.getId());
        return projeDto;
    }

    public ProjeKayitResponse saveProje(Proje proje) {
        ProjeKayitResponse response = new ProjeKayitResponse();
        projeRepository.save(proje);
        response.setBasariliMi(true);
        return response;
    }

    public ProjeKayitResponse assignProje(String projeKonusu, Integer kullaniciId, Integer dersId) {
        ProjeKayitResponse response = new ProjeKayitResponse();
        Proje projeActual = projeRepository.findByKullaniciIdAndDersId(kullaniciId, dersId);
        if (projeActual == null) {
            Proje proje = new Proje();
            proje.setProjeKonusu(projeKonusu);
            proje.setKullaniciId(kullaniciId);
            proje.setSonIslemTarihi(formattedDate());
            proje.setSonIslem("0");
            proje.setDurum(0);
            proje.setDersId(dersId);
            projeRepository.save(proje);
        } else {
            projeActual.setProjeKonusu(projeKonusu);
            projeRepository.save(projeActual);
        }
        response.setBasariliMi(true);
        return response;
    }

    public ProjeKayitResponse updateProje(Integer projeId) {
        ProjeKayitResponse response = new ProjeKayitResponse();
        Optional<Proje> proje = projeRepository.findById(projeId);
        if (proje.isPresent()) {
            proje.get().setDurum(proje.get().getDurum() + 1);
            proje.get().setSonIslem((Integer.valueOf(proje.get().getSonIslem()) + 1) + "");
            proje.get().setSonIslemTarihi(formattedDate());
            projeRepository.save(proje.get());
        }
        response.setBasariliMi(true);
        return response;
    }


}

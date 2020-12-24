package com.proje.yonetim.service;

import com.proje.yonetim.entities.Kullanici;
import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.model.MesajDto;
import com.proje.yonetim.model.MesajKayitResponse;
import com.proje.yonetim.model.MesajResponse;
import com.proje.yonetim.repository.KullaniciRepository;
import com.proje.yonetim.repository.MesajRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MesajService {

    @Autowired
    private MesajRepository mesajRepository;

    @Autowired
    private KullaniciRepository kullaniciRepository;

    public MesajResponse getMesajList() {
        MesajResponse response = new MesajResponse();
        //List<Mesaj> mesajList = mesajRepository.findAll();
        //response.setMesajList(mesajList);
        return response;

    }

    public MesajKayitResponse mesajKayit(Mesaj mesaj) {
        MesajKayitResponse response = new MesajKayitResponse();
        mesaj.setDurum("aktif");
        mesaj.setTarih(formattedDate());
        mesajRepository.save(mesaj);
        response.setSaved(true);
        return response;
    }

    private String formattedDate() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        return myDateObj.format(myFormatObj);
    }

    public MesajResponse getMesajBykullaniciId(Integer kullaniciId, Integer kim) {
        MesajResponse response = new MesajResponse();
        List<Mesaj> mesajList = null;
        List<MesajDto> mesajDtoList = new ArrayList<>();
        if (kim == 1) {
            mesajList = mesajRepository.findByGonderilenkullaniciid(kullaniciId);
            mesajDtoList = mesajList.stream().map(e -> convert(e)).collect(Collectors.toList());
        } else {
            mesajList = mesajRepository.findByGonderenkullaniciid(kullaniciId);
            mesajDtoList = mesajList.stream().map(e -> convert(e)).collect(Collectors.toList());
        }
        response.setMesajList(mesajDtoList);
        return response;
    }


    private MesajDto convert(Mesaj mesaj) {
        MesajDto mesajDto = new MesajDto();
        mesajDto.setDosyaicerigi(mesaj.getDosyaicerigi());
        mesajDto.setDosyaekivarmi(mesaj.getDosyaekivarmi());
        mesajDto.setMesajbasligi(mesaj.getMesajbasligi());
        mesajDto.setId(mesaj.getId());
        mesajDto.setTarih(mesaj.getTarih());
        mesajDto.setMesajicerigi(mesaj.getMesajicerigi());

        if (mesaj.getGonderenkullaniciid() != null) {
            Optional<Kullanici> kullanici1 = kullaniciRepository.findById(mesaj.getGonderenkullaniciid());
            mesajDto.setGonderenAdSoyad(kullanici1.isPresent() ? kullanici1.get().getAdSoyad() : null);
        }
        if (mesaj.getGonderilenkullaniciid() != null) {
            Optional<Kullanici> kullanici2 = kullaniciRepository.findById(mesaj.getGonderilenkullaniciid());
            mesajDto.setGonderilenAdSoyad(kullanici2.isPresent() ? kullanici2.get().getAdSoyad() : null);
        }
        return mesajDto;
    }

}

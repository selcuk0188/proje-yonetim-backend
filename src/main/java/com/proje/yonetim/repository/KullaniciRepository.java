package com.proje.yonetim.repository;

import com.proje.yonetim.entities.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KullaniciRepository extends JpaRepository<Kullanici, Integer> {

    Kullanici findByKullaniciAdiAndSifre(String kullaniciAdi, String sifre);

    List<Kullanici> findByRolId(Integer rolId);

}

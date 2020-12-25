package com.proje.yonetim.repository;

import com.proje.yonetim.entities.KullaniciDers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KullaniciDersRepository extends JpaRepository<KullaniciDers, Integer> {

    List<KullaniciDers> findByKullaniciId(Integer kullaniciId);

    List<KullaniciDers> findByDersId(Integer dersId);
}

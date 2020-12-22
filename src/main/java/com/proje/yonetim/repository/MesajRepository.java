package com.proje.yonetim.repository;

import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MesajRepository extends JpaRepository<Mesaj, Integer> {

    List<Mesaj> findByGonderenkullaniciid(Integer kullaniciId);

    List<Mesaj> findByGonderilenkullaniciid(Integer kullaniciId);
}

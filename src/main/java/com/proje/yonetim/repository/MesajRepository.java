package com.proje.yonetim.repository;

import com.proje.yonetim.entities.Mesaj;
import com.proje.yonetim.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesajRepository extends JpaRepository<Mesaj, Integer> {
}

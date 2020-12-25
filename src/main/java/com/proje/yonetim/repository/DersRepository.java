package com.proje.yonetim.repository;

import com.proje.yonetim.entities.Ders;
import com.proje.yonetim.entities.Proje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DersRepository extends JpaRepository<Ders, Integer> {  // ders tablosu ile iletisim kuran repository
}

package com.proje.yonetim.repository;

import com.proje.yonetim.entities.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciRepository extends JpaRepository<Kullanici, Integer> {
}

package com.proje.yonetim.repository;

import com.proje.yonetim.entities.Proje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjeRepository extends JpaRepository<Proje, Integer> {

    List<Proje> findBykullaniciId(Integer kullaniciId);
}

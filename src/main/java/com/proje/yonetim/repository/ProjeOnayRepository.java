package com.proje.yonetim.repository;

import com.proje.yonetim.entities.ProjeOnay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjeOnayRepository extends JpaRepository<ProjeOnay, Integer> {

    ProjeOnay findByProjeId(Integer projeId);
}

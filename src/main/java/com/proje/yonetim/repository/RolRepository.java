package com.proje.yonetim.repository;

import com.proje.yonetim.entities.Proje;
import com.proje.yonetim.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Integer> {
}

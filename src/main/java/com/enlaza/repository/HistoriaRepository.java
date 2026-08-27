package com.enlaza.repository;

import com.enlaza.entity.Historia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoriaRepository extends JpaRepository<Historia, Long> {

    List<Historia> findByUsuarioId(Long usuarioId);

    List<Historia> findByActivaTrue();

}
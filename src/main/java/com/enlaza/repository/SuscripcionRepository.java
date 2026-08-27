package com.enlaza.repository;

import com.enlaza.entity.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuscripcionRepository extends JpaRepository<Suscripcion, Long> {

    List<Suscripcion> findByUsuarioId(Long usuarioId);

    List<Suscripcion> findByActivaTrue();

}
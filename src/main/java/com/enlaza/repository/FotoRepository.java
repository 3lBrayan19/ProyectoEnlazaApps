package com.enlaza.repository;

import com.enlaza.entity.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FotoRepository extends JpaRepository<Foto, Long> {
    List<Foto> findByUsuarioId(Long usuarioId);
}
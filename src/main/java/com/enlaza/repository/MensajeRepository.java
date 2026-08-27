package com.enlaza.repository;

import com.enlaza.entity.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long> {

    // Buscar mensajes enviados por un usuario
    List<Mensaje> findByRemitenteId(Long remitenteId);

    // Buscar mensajes recibidos por un usuario
    List<Mensaje> findByDestinatarioId(Long destinatarioId);

    // Buscar conversación entre dos usuarios
    List<Mensaje> findByRemitenteIdAndDestinatarioId(Long remitenteId, Long destinatarioId);
}

package com.enlaza.repository;

import com.enlaza.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    // Buscar matches de un usuario específico
    List<Match> findByUsuario1Id(Long usuario1Id);

    List<Match> findByUsuario2Id(Long usuario2Id);

    // Buscar matches entre dos usuarios
    List<Match> findByUsuario1IdAndUsuario2Id(Long usuario1Id, Long usuario2Id);
}

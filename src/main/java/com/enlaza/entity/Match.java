package com.enlaza.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Usuario que inicia el match
    @ManyToOne
    @JoinColumn(name = "usuario1_id", nullable = false)
    private Usuario usuario1;

    // Usuario con el que se hace match
    @ManyToOne
    @JoinColumn(name = "usuario2_id", nullable = false)
    private Usuario usuario2;

    // Fecha en que se creó el match
    private LocalDateTime fechaMatch;

    // Estado del match (activo, bloqueado, eliminado, etc.)
    private String estado;

    // Constructor vacío
    public Match() {}

    // Constructor con parámetros
    public Match(Usuario usuario1, Usuario usuario2, LocalDateTime fechaMatch, String estado) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.fechaMatch = fechaMatch;
        this.estado = estado;
    }

    // Getters y setters
    public Long getId() { return id; }
    public Usuario getUsuario1() { return usuario1; }
    public void setUsuario1(Usuario usuario1) { this.usuario1 = usuario1; }
    public Usuario getUsuario2() { return usuario2; }
    public void setUsuario2(Usuario usuario2) { this.usuario2 = usuario2; }
    public LocalDateTime getFechaMatch() { return fechaMatch; }
    public void setFechaMatch(LocalDateTime fechaMatch) { this.fechaMatch = fechaMatch; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}

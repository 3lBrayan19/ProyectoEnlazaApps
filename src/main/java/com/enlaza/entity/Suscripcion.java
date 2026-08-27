package com.enlaza.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "suscripciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Suscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId;

    @Enumerated(EnumType.STRING)
    private TipoSuscripcion tipo;

    @Builder.Default
    private LocalDateTime fechaInicio = LocalDateTime.now();

    private LocalDateTime fechaFin;

    @Builder.Default
    private Boolean activa = true;

    public enum TipoSuscripcion {
        ESTANDAR,
        PREMIUM,
        PLATINO
    }
}
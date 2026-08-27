package com.enlaza.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "historias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Historia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId;

    @Column(length = 500)
    private String contenido;

    @Builder.Default
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    private LocalDateTime fechaExpiracion;

    @Builder.Default
    private Boolean activa = true;
}
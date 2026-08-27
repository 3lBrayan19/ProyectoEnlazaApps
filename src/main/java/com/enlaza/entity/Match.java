package com.enlaza.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "matches")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioA;

    private Long usuarioB;

    @Builder.Default
    private Boolean mutuo = false;

    @Builder.Default
    private Boolean activo = true;

    @Builder.Default
    private LocalDateTime fechaMatch = LocalDateTime.now();
}
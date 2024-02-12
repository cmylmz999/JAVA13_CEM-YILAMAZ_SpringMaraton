package com.cem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_randevu")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Builder.Default
    Integer randevuSuresi = 30;
    LocalDateTime randevuZamani;

    @ManyToOne
    Doktor doktor;

    @ManyToOne
    Hasta hasta;

    @Embedded
    @Builder.Default
    BaseEntity baseEntity = new BaseEntity();

}

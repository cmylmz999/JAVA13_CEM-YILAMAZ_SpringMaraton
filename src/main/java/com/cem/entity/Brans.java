package com.cem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_brans")
public class Brans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "brans_adi", unique = true)
    String bransAdi;

    @Embedded
    @Builder.Default
    BaseEntity baseEntity = new BaseEntity();


}

package com.cem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_doktor")
public class Doktor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String adres;
//    @Email     // TODO EMAIL ANOTASYONLARI HIZLI VERI GIRISI ICIN KAPANDI.
    String mail;
    String telefon;
    @Column(name = "tc_kimlik", nullable = false) //TODO UNIQUE CONSTRAINTI EKLENECEK
    Long tcKimlik;

    Long bransId;

    @OneToMany(mappedBy = "doktor", cascade = CascadeType.ALL)
    List<Randevu> randevuList;

    @Embedded
    @Builder.Default
    BaseEntity baseEntity = new BaseEntity();

}

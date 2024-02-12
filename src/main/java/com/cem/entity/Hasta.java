package com.cem.entity;

import jakarta.persistence.*;
import jakarta.validation.Constraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraintvalidation.SupportedValidationTarget;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

import static com.cem.constants.RestApiUrls.REGISTER;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_hasta")
public class Hasta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    @Column(name = "ad")
    String ad;
    @Column(name = "soyad")
    String soyad;
    @Column(name = "tc_kimlik",nullable = false) //TODO UNIQUE YAPILMADI HENUZ.
    Long tcKimlik;
    @Column(name = "adres")
    String adres;
//    @Email
    String mail;

    @OneToMany(cascade= CascadeType.ALL,mappedBy = "hasta")
    List<Randevu> randevuList;

    @Embedded
    @Builder.Default
    BaseEntity baseEntity = new BaseEntity();
}

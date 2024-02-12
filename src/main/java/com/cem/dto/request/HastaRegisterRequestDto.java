package com.cem.dto.request;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HastaRegisterRequestDto {

    String ad;
    String soyad;
    Long tcKimlik;
//    @Email  // TODO HIZLI VERI GIRISI ICIN KAPANDI
    String mail;
    String adres;

}

package com.cem.dto.response;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HastaRegisterResponseDto {

    String ad;
    String soyad;
    Long tcKimlik;
    @Email
    String mail;
    String adres;
}

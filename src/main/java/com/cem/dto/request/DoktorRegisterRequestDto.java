package com.cem.dto.request;

import com.cem.utils.Mobile;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoktorRegisterRequestDto {

    String ad;
    String soyad;
    String adres;
//    @Email  TODO HIZLI VERI GIRISI ICIN KAPANDI.
    String mail;
    @Mobile
    String telefon;
    Long bransId;
    Long tcKimlik;
}

package com.cem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoktorRegisterResponseDto {

    String ad;
    String soyad;
    String telefon;
    Long tcKimlik;

}

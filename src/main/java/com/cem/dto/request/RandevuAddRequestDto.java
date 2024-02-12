package com.cem.dto.request;

import com.cem.entity.Brans;
import com.cem.entity.Doktor;
import com.cem.entity.Hasta;
import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RandevuAddRequestDto  {
    LocalDateTime randevuZamani;
    String doktorAdi;
    String doktorSoyadi;
    String bransAdi;
    @NotNull
    Long hastaTcKimlik;
    @NotNull
    String hastaAdi;

    @AssertTrue(message = "Brans ya da doktor girilmeli")
    private boolean isEitherFieldSet() {
        return (doktorAdi != null && bransAdi != null);
    }


}

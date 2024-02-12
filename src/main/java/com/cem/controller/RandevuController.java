package com.cem.controller;

import com.cem.dto.request.RandevuAddRequestDto;
import com.cem.entity.Randevu;
import com.cem.service.RandevuServis;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.cem.constants.RestApiUrls.ADD;
import static com.cem.constants.RestApiUrls.RANDEVU;

@RestController
@RequestMapping(RANDEVU)
@RequiredArgsConstructor
public class RandevuController {
    private final RandevuServis randevuServis;

    @PostMapping(ADD)
    public ResponseEntity<Randevu> add(@RequestBody RandevuAddRequestDto dto){
        return ResponseEntity.ok(randevuServis.add(dto));

    }

}

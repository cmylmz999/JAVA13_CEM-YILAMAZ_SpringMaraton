package com.cem.controller;

import com.cem.entity.Brans;
import com.cem.service.BransServis;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.cem.constants.RestApiUrls.ADD;
import static com.cem.constants.RestApiUrls.BRANS;

@RestController
@RequestMapping(BRANS)
@RequiredArgsConstructor
public class BransController {
    private final BransServis bransServis;

    @PostMapping(ADD)
    public ResponseEntity<Brans> add(@RequestParam String bransAdi){
        return ResponseEntity.ok(bransServis.save(Brans.builder()
                .bransAdi(bransAdi)
                .build()));

    }

}

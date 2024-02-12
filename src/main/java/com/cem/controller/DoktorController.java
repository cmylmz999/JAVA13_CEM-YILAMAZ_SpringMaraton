package com.cem.controller;

import com.cem.dto.request.DoktorRegisterRequestDto;
import com.cem.dto.response.DoktorRegisterResponseDto;
import com.cem.entity.Doktor;
import com.cem.entity.Hasta;
import com.cem.service.DoktorServis;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.cem.constants.RestApiUrls.*;

@RestController
@RequestMapping(DOKTOR)
@RequiredArgsConstructor
public class DoktorController {
    private final DoktorServis doktorServis;

    @PostMapping(REGISTER)
    public ResponseEntity<DoktorRegisterResponseDto> register(@RequestBody @Valid DoktorRegisterRequestDto dto){
        return ResponseEntity.ok(doktorServis.register(dto));
    }
    @PostMapping(GET_ALL)
    public ResponseEntity<List<Doktor>> findAll(){
        return ResponseEntity.ok(doktorServis.findAll());
    }
}

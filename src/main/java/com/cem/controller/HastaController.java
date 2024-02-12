package com.cem.controller;

import com.cem.dto.request.HastaAcilGirisRequestDto;
import com.cem.dto.request.HastaRegisterRequestDto;
import com.cem.dto.response.HastaRegisterResponseDto;
import com.cem.entity.Hasta;
import com.cem.service.HastaServis;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.cem.constants.RestApiUrls.*;

@RestController
@RequestMapping(HASTA)
@RequiredArgsConstructor
public class HastaController {
    private final HastaServis hastaServis;

    @PostMapping(REGISTER)
    public ResponseEntity<HastaRegisterResponseDto> register(@RequestBody @Valid HastaRegisterRequestDto dto){
        return ResponseEntity.ok(hastaServis.register(dto));
    }

    @PostMapping(GET_ALL)
    public ResponseEntity<List<Hasta>> findAll(){
        return ResponseEntity.ok(hastaServis.findAll());
    }

    @PostMapping(FAST_REGISTRATION)
    public ResponseEntity<Boolean> fastRegistration(@RequestBody HastaAcilGirisRequestDto dto){
        return ResponseEntity.ok(hastaServis.fastRegistration(dto));

    }

}

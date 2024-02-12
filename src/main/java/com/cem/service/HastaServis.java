package com.cem.service;

import com.cem.dto.request.HastaAcilGirisRequestDto;
import com.cem.dto.request.HastaRegisterRequestDto;
import com.cem.dto.response.HastaRegisterResponseDto;
import com.cem.entity.Hasta;
import com.cem.mapper.HastaMapper;
import com.cem.repository.HastaRepository;
import com.cem.utils.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class HastaServis extends ServiceManager<Hasta,Long> {
    private final HastaRepository hastaRepository;

    public HastaServis(HastaRepository hastaRepository) {
        super(hastaRepository);
        this.hastaRepository = hastaRepository;
    }

    public HastaRegisterResponseDto register(HastaRegisterRequestDto dto) {
        Hasta hasta = HastaMapper.INSTANCE.fromHastaRegisterRequestToHasta(dto);
        hastaRepository.save(hasta);
        return HastaMapper.INSTANCE.fromHastaToRegisterResponse(hasta);
    }


    public Boolean fastRegistration(HastaAcilGirisRequestDto dto) {
        Hasta hasta = HastaMapper.INSTANCE.fromHastaFasTRegistrationRequestToHasta(dto);
        hastaRepository.save(hasta);
        return true;
    }

    public Optional<Hasta> findByTcKimlik(Long tcKimlik){
        return hastaRepository.findOptionalByTcKimlik(tcKimlik);
    }
}

package com.cem.service;

import com.cem.dto.request.DoktorRegisterRequestDto;
import com.cem.dto.response.DoktorRegisterResponseDto;
import com.cem.entity.Doktor;
import com.cem.exception.DoktorServisException;
import com.cem.exception.ErrorType;
import com.cem.exception.GlobalExceptionHandler;
import com.cem.mapper.DoktorMapper;
import com.cem.repository.DoktorRepository;
import com.cem.utils.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoktorServis extends ServiceManager<Doktor,Long> {
    private final DoktorRepository doktorRepository;
    private final BransServis bransServis;

    public DoktorServis(DoktorRepository doktorRepository, BransServis bransServis) {
        super(doktorRepository);
        this.doktorRepository = doktorRepository;
        this.bransServis = bransServis;
    }

    public DoktorRegisterResponseDto register(DoktorRegisterRequestDto dto) {
        if (bransServis.findOptionalByBransId(dto.getBransId()).isEmpty())
            throw new DoktorServisException(ErrorType.ERROR_INVALID_REGISTER_PARAMETER,"Brans bulunamadi.");

        Doktor doktor = DoktorMapper.INSTANCE.fromDoktorRegisterRequestToDoktor(dto);
        doktorRepository.save(doktor);
        return DoktorMapper.INSTANCE.fromDoktorToRegisterResponseDto(doktor);
    }
    public List<Doktor> findAllByAdAndSoyad(String ad, String soyad){
        return doktorRepository.findAllByAdAndSoyad(ad,soyad);
    }

    public List<Doktor> findAllByAd(String ad){
        return doktorRepository.findAllByAd(ad);
    }
    public List<Doktor> findAllByBransId(Long id){
        return doktorRepository.findAllByBransId(id);
    }

}

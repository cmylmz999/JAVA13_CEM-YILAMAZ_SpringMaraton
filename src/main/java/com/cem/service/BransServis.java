package com.cem.service;

import com.cem.entity.Brans;
import com.cem.repository.BransRepository;
import com.cem.utils.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BransServis extends ServiceManager<Brans, Long> {
    private final BransRepository bransRepository;

    public BransServis(BransRepository bransRepository) {
        super(bransRepository);
        this.bransRepository = bransRepository;
    }

    public Brans findBransIdByBransAdi(String bransAdi){
        return bransRepository.findBransIdByBransAdi(bransAdi);
    }

    public Optional<Brans> findOptionalByBransId(Long id){
        return bransRepository.findOptionalById(id);
    }
}

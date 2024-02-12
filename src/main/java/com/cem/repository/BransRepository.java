package com.cem.repository;

import com.cem.entity.Brans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BransRepository extends JpaRepository<Brans,Long> {

    Brans findBransIdByBransAdi(String ad);
    Optional<Brans> findOptionalById(Long id);
}

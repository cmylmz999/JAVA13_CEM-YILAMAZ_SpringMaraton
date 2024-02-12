package com.cem.repository;

import com.cem.entity.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HastaRepository extends JpaRepository<Hasta, Long> {

    Optional<Hasta> findOptionalByTcKimlik(Long tcKimlik);
}

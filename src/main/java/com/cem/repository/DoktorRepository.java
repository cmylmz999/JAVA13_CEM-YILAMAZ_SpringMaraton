package com.cem.repository;

import com.cem.entity.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoktorRepository extends JpaRepository<Doktor, Long> {

    List<Doktor> findAllByAdAndSoyad(String ad, String soyad);
    List<Doktor> findAllByAd(String ad);

    List<Doktor> findAllByBransId(Long id);
}

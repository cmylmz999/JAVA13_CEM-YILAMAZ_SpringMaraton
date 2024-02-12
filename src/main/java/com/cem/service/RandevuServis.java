package com.cem.service;

import com.cem.dto.request.RandevuAddRequestDto;
import com.cem.entity.Doktor;
import com.cem.entity.Hasta;
import com.cem.entity.Randevu;
import com.cem.repository.RandevuRepository;
import com.cem.utils.ServiceManager;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class RandevuServis extends ServiceManager<Randevu, Long> {
    private final RandevuRepository randevuRepository;
    private final HastaServis hastaServis;
    private final DoktorServis doktorServis;
    private final BransServis bransServis;


    public RandevuServis(RandevuRepository randevuRepository,HastaServis hastaServis, DoktorServis doktorServis, BransServis bransServis) {
        super(randevuRepository);
        this.randevuRepository = randevuRepository;
        this.hastaServis = hastaServis;
        this.doktorServis = doktorServis;
        this.bransServis = bransServis;
    }


    public Randevu add(RandevuAddRequestDto dto) {
        Doktor doktor = null;
        Hasta hasta;
        List<Doktor> doktorList;

//TODO DOKTOR ADI VE BRANSIYLA BULAN METOD YAZILMADI. AYRICA SOYADINI KULLANMADIK.
        if(dto.getDoktorAdi().isEmpty()){
            doktorList = doktorServis.findAllByBransId(bransServis.findBransIdByBransAdi(dto.getBransAdi()).getId());
        }
        else{
            doktorList = doktorServis.findAllByAd(dto.getDoktorAdi());
        }
        if(doktorList.size()<2){
            doktor = doktorList.getFirst();
        }
        else{
            searchForDoctors(doktorList);
        }

        Optional<Hasta> hastaOptional = hastaServis.findByTcKimlik(dto.getHastaTcKimlik());
        hasta = hastaOptional.orElseGet(() -> Hasta.builder()
                .ad(dto.getHastaAdi())
                .tcKimlik(dto.getHastaTcKimlik())
                .build());
        LocalDateTime now = LocalDateTime.now(); // TODO RANDEVU DEFTERI ICIN AYRI BIR ENTITY GEREKIYOR.

        // Define a date-time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Format the LocalDateTime object
        String formattedDateTime = now.format(formatter);


        return Randevu.builder()
                        .randevuZamani(now)
                        .doktor(doktor)
                        .hasta(hasta)
                        .build();
    }

    private void searchForDoctors(List<Doktor> doktorList) {
        AtomicReference<String> mesaj = new AtomicReference<>("Birden fazla doktor bulundu. Lutfen secim yapiniz.\n");
        doktorList.forEach(doktors -> {
            String ad =doktors.getAd();
            String soyad = doktors.getSoyad();
            mesaj.set(mesaj + ad + soyad);
        });
        System.out.println(mesaj.get());
    }


}

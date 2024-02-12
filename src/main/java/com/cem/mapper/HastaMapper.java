package com.cem.mapper;

import com.cem.dto.request.HastaAcilGirisRequestDto;
import com.cem.dto.request.HastaRegisterRequestDto;
import com.cem.dto.response.HastaRegisterResponseDto;
import com.cem.entity.Hasta;
import jakarta.security.auth.message.MessagePolicy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HastaMapper {

    HastaMapper INSTANCE = Mappers.getMapper(HastaMapper.class);

    Hasta fromHastaRegisterRequestToHasta(final HastaRegisterRequestDto dto);
    HastaRegisterResponseDto fromHastaToRegisterResponse(final Hasta hasta);

    Hasta fromHastaFasTRegistrationRequestToHasta(final HastaAcilGirisRequestDto dto);

}

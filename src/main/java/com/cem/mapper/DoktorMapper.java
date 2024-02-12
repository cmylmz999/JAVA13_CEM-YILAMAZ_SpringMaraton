package com.cem.mapper;

import com.cem.dto.request.DoktorRegisterRequestDto;
import com.cem.dto.response.DoktorRegisterResponseDto;
import com.cem.entity.Doktor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoktorMapper {

    DoktorMapper INSTANCE = Mappers.getMapper(DoktorMapper.class);

    Doktor fromDoktorRegisterRequestToDoktor(final DoktorRegisterRequestDto dto);
    DoktorRegisterResponseDto fromDoktorToRegisterResponseDto(final Doktor doktor);
}

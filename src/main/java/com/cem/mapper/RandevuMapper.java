package com.cem.mapper;

import com.cem.dto.request.RandevuAddRequestDto;
import com.cem.entity.Hasta;
import com.cem.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RandevuMapper {




}

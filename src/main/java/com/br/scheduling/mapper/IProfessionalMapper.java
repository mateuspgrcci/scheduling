package com.br.scheduling.mapper;

import com.br.scheduling.dto.ProfessionalDTO;
import com.br.scheduling.entity.Professional;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {IServiceMapper.class, IScheduleMapper.class})
public interface IProfessionalMapper {

    ProfessionalDTO toDto (Professional professional);

    Professional toEntity (ProfessionalDTO professionalDTO);
}

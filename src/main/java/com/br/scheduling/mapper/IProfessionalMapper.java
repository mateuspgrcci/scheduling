package com.br.scheduling.mapper;

import com.br.scheduling.dto.Professional.ProfessionalDTO;
import com.br.scheduling.entity.Professional;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {IScheduleMapper.class})
public interface IProfessionalMapper {

    ProfessionalDTO toDto (Professional professional);

    Professional toEntity (ProfessionalDTO professionalDTO);

    List<ProfessionalDTO> toListDto (List<Professional> professional);
}

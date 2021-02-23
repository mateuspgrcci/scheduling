package com.br.scheduling.mapper;

import com.br.scheduling.dto.Procedure.ProcedureRequestDTO;
import com.br.scheduling.dto.Procedure.ProcedureResponseDTO;
import com.br.scheduling.entity.Procedure;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {IProfessionalMapper.class, IScheduleMapper.class})
public interface IProcedureMapper {

    @Mappings({
            @Mapping(source = "procedure.professional.name", target = "professionalName")
    })
    ProcedureResponseDTO toDto (Procedure procedure);

    @Mappings({
            @Mapping(source = "procedureRequestDTO.professionalId", target = "professional.id")
    })
    Procedure toEntity (ProcedureRequestDTO procedureRequestDTO);

    @Mappings({
            @Mapping(source = "procedure.professional.name", target = "professionalName")
    })
    List<ProcedureResponseDTO> toListDto (List<Procedure> procedure);
}

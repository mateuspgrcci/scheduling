package com.br.scheduling.mapper;

import com.br.scheduling.dto.Schedule.ScheduleRequestDTO;
import com.br.scheduling.dto.Schedule.ScheduleResponseDTO;
import com.br.scheduling.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {IClientMapper.class, IProcedureMapper.class, IProfessionalMapper.class})
public interface IScheduleMapper {

    @Mappings({
            @Mapping(source = "schedule.client.name", target = "clientName"),
            @Mapping(source = "schedule.client.phone", target = "clientPhone"),
            @Mapping(source = "schedule.procedure.name", target = "procedureName"),
            @Mapping(source = "schedule.professional.name", target = "professionalName")
    })
    ScheduleResponseDTO toDto (Schedule schedule);

    @Mappings({
            @Mapping(source = "scheduleRequestDTO.clientId", target = "client.id"),
            @Mapping(source = "scheduleRequestDTO.procedureId", target = "procedure.id"),
            @Mapping(source = "scheduleRequestDTO.professionalId", target = "professional.id")

    })
    Schedule toEntity (ScheduleRequestDTO scheduleRequestDTO);

    @Mappings({
            @Mapping(source = "schedule.client.name", target = "clientName"),
            @Mapping(source = "schedule.client.phone", target = "clientPhone"),
            @Mapping(source = "schedule.procedure.name", target = "procedureName"),
            @Mapping(source = "schedule.professional.name", target = "professionalName")
    })
    List<ScheduleResponseDTO> toListDto (List<Schedule> schedule);
}

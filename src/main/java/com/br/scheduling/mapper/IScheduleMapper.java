package com.br.scheduling.mapper;

import com.br.scheduling.dto.Schedule.ScheduleRequestDTO;
import com.br.scheduling.dto.Schedule.ScheduleResponseDTO;
import com.br.scheduling.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {IClientMapper.class, IServiceMapper.class, IProfessionalMapper.class})
public interface IScheduleMapper {

    @Mappings({
            @Mapping(source = "schedule.client.name", target = "clientName"),
            @Mapping(source = "schedule.client.phone", target = "clientPhone"),
            @Mapping(source = "schedule.service.name", target = "serviceName"),
            @Mapping(source = "schedule.professional.name", target = "professionalName")
    })
    ScheduleResponseDTO toDto (Schedule schedule);

    @Mappings({
            @Mapping(source = "scheduleRequestDTO.clientId", target = "client.id"),
            @Mapping(source = "scheduleRequestDTO.serviceId", target = "service.id"),
            @Mapping(source = "scheduleRequestDTO.professionalId", target = "professional.id")

    })
    Schedule toEntity (ScheduleRequestDTO scheduleRequestDTO);

    @Mappings({
            @Mapping(source = "schedule.client.name", target = "clientName"),
            @Mapping(source = "schedule.client.phone", target = "clientPhone"),
            @Mapping(source = "schedule.service.name", target = "serviceName"),
            @Mapping(source = "schedule.professional.name", target = "professionalName")
    })
    List<ScheduleResponseDTO> toListDto (List<Schedule> schedule);
}

package com.br.scheduling.mapper;

import com.br.scheduling.dto.ServiceDTO;
import com.br.scheduling.entity.Service;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {IProfessionalMapper.class, IScheduleMapper.class})
public interface IServiceMapper {

    @Mappings({
            @Mapping(source = "service.professional", target = "professionalDTO")
    })
    ServiceDTO toDto (Service service);

    @Mappings({
            @Mapping(source = "serviceDTO.professionalDTO", target = "professional")
    })
    Service toEntity (ServiceDTO serviceDTO);
}

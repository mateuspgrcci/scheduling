package com.br.scheduling.mapper;

import com.br.scheduling.dto.ClientDTO;
import com.br.scheduling.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {IScheduleMapper.class})
public interface IClientMapper {

    ClientDTO toDto (Client client);

    Client toEntity (ClientDTO clientDTO);
}

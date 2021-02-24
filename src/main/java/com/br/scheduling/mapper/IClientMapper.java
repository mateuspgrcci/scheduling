package com.br.scheduling.mapper;

import com.br.scheduling.dto.Client.ClientDTO;
import com.br.scheduling.entity.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {IScheduleMapper.class})
public interface IClientMapper {

    ClientDTO toDto (Client client);

    Client toEntity (ClientDTO clientDTO);

    List<ClientDTO> toListDto (List<Client> client);
}

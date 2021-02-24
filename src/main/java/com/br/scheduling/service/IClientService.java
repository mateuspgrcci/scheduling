package com.br.scheduling.service;

import com.br.scheduling.dto.Client.ClientDTO;

import java.util.List;
import java.util.UUID;

public interface IClientService {

    List<ClientDTO> findAll();

    ClientDTO findById(UUID id);

    void store (ClientDTO dto);

    void update (ClientDTO dto);

    void delete (ClientDTO dto);
}

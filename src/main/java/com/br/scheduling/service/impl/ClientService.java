package com.br.scheduling.service.impl;

import com.br.scheduling.dto.Client.ClientDTO;
import com.br.scheduling.mapper.IClientMapper;
import com.br.scheduling.repository.IClientRepository;
import com.br.scheduling.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ClientService implements IClientService {

    @Autowired
    IClientMapper mapper;

    @Autowired
    IClientRepository repository;

    @Override
    public List<ClientDTO> findAll() {
        return mapper.toListDto(repository.findAll());
    }

    @Override
    public ClientDTO findById(UUID id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }

    @Override
    public void store(ClientDTO dto) {
        dto.setActive(Boolean.TRUE);
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void update(ClientDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void delete(ClientDTO dto) {
        dto.setActive(Boolean.FALSE);
        repository.save(mapper.toEntity(dto));
    }
}

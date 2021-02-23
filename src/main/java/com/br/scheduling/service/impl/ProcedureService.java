package com.br.scheduling.service.impl;

import com.br.scheduling.dto.Procedure.ProcedureRequestDTO;
import com.br.scheduling.dto.Procedure.ProcedureResponseDTO;
import com.br.scheduling.mapper.IProcedureMapper;
import com.br.scheduling.repository.IProcedureRepository;
import com.br.scheduling.service.IProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProcedureService implements IProcedureService {

    @Autowired
    IProcedureMapper mapper;

    @Autowired
    IProcedureRepository repository;

    @Override
    public List<ProcedureResponseDTO> findAll() {
        return mapper.toListDto(repository.findAll());
    }

    @Override
    public ProcedureResponseDTO findById(UUID id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }

    @Override
    public void store(ProcedureRequestDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void update(ProcedureRequestDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void delete(ProcedureRequestDTO dto) {
        dto.setActive(Boolean.FALSE);
        repository.save(mapper.toEntity(dto));
    }
}

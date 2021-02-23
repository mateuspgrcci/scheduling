package com.br.scheduling.service.impl;

import com.br.scheduling.dto.Professional.ProfessionalDTO;
import com.br.scheduling.mapper.IProfessionalMapper;
import com.br.scheduling.repository.IProfessionalRepository;
import com.br.scheduling.service.IProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProfessionalService implements IProfessionalService {

    @Autowired
    IProfessionalMapper mapper;

    @Autowired
    IProfessionalRepository repository;

    @Override
    public List<ProfessionalDTO> findAll() {
        return mapper.toListDto(repository.findAll());
    }

    @Override
    public ProfessionalDTO findById(UUID id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }

    @Override
    public void store(ProfessionalDTO professionalDTO) {
        repository.save(mapper.toEntity(professionalDTO));
    }

    @Override
    public void update(ProfessionalDTO professionalDTO) {
        repository.save(mapper.toEntity(professionalDTO));
    }

    @Override
    public void delete(ProfessionalDTO professionalDTO) {
        professionalDTO.setActive(Boolean.FALSE);
        repository.save(mapper.toEntity(professionalDTO));
    }
}

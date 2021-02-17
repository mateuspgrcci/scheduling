package com.br.scheduling.service.impl;

import com.br.scheduling.dto.Professional.ProfessionalDTO;
import com.br.scheduling.mapper.IProfessionalMapper;
import com.br.scheduling.repository.IProfessionalRepository;
import com.br.scheduling.service.IProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfessinalService implements IProfessionalService {

    @Autowired
    IProfessionalMapper mapper;

    @Autowired
    IProfessionalRepository repository;

    @Override
    public void store(ProfessionalDTO professionalDTO) {
        repository.save(mapper.toEntity(professionalDTO));
    }
}

package com.br.scheduling.service;

import com.br.scheduling.dto.Professional.ProfessionalDTO;

import java.util.List;
import java.util.UUID;

public interface IProfessionalService {

    List<ProfessionalDTO> findAll();

    ProfessionalDTO findById(UUID id);

    void store (ProfessionalDTO professionalDTO);
}

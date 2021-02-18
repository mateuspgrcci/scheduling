package com.br.scheduling.service;

import com.br.scheduling.dto.Professional.ProfessionalDTO;

import java.util.List;

public interface IProfessionalService {

    List<ProfessionalDTO> findAll();

    void store (ProfessionalDTO professionalDTO);
}

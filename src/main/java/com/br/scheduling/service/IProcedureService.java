package com.br.scheduling.service;

import com.br.scheduling.dto.Procedure.ProcedureRequestDTO;
import com.br.scheduling.dto.Procedure.ProcedureResponseDTO;

import java.util.List;
import java.util.UUID;

public interface IProcedureService {

    List<ProcedureResponseDTO> findAll();

    ProcedureResponseDTO findById(UUID id);

    void store (ProcedureRequestDTO dto);

    void update (ProcedureRequestDTO dto);

    void delete (ProcedureRequestDTO dto);
}

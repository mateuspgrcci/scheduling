package com.br.scheduling.service;

import com.br.scheduling.dto.Schedule.ScheduleRequestDTO;
import com.br.scheduling.dto.Schedule.ScheduleResponseDTO;

import java.util.List;
import java.util.UUID;

public interface IScheduleService {

    List<ScheduleResponseDTO> findAll();

    ScheduleResponseDTO findById(UUID id);

    void store(ScheduleRequestDTO scheduleRequestDTO);

    void update(ScheduleRequestDTO scheduleRequestDTO);

    void delete(ScheduleRequestDTO scheduleRequestDTO);
}

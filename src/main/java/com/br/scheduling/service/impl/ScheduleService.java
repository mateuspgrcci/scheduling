package com.br.scheduling.service.impl;

import com.br.scheduling.dto.Schedule.ScheduleRequestDTO;
import com.br.scheduling.dto.Schedule.ScheduleResponseDTO;
import com.br.scheduling.entity.Schedule;
import com.br.scheduling.mapper.IScheduleMapper;
import com.br.scheduling.repository.IScheduleRepository;
import com.br.scheduling.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class ScheduleService implements IScheduleService {

    @Autowired
    private IScheduleMapper mapper;

    @Autowired
    private IScheduleRepository repository;

    @Override
    public List<ScheduleResponseDTO> findAll() {
        List<Schedule> scheduleList = repository.findAll();
        return mapper.toListDto(scheduleList);
    }

    @Override
    public ScheduleResponseDTO findById(UUID id) {
        Optional<Schedule> schedule = repository.findById(id);
        return mapper.toDto(schedule.orElse(null));
    }

    @Override
    public void store(ScheduleRequestDTO scheduleRequestDTO) {
        repository.save(mapper.toEntity(scheduleRequestDTO));
    }

    @Override
    public void update(ScheduleRequestDTO scheduleRequestDTO) {
        repository.save(mapper.toEntity(scheduleRequestDTO));
    }

    @Override
    public void delete(ScheduleRequestDTO scheduleRequestDTO) {
        repository.delete(mapper.toEntity(scheduleRequestDTO));
    }
}

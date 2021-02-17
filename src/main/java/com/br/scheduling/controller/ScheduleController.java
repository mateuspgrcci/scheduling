package com.br.scheduling.controller;

import com.br.scheduling.dto.Schedule.ScheduleRequestDTO;
import com.br.scheduling.dto.Schedule.ScheduleResponseDTO;
import com.br.scheduling.service.impl.ScheduleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@Api(value = "Scheduling API REST")
@CrossOrigin(origins = "*")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping(path = "/schedules")
    @ApiOperation(value = "Get all scheduling")
    public ResponseEntity<List<ScheduleResponseDTO>> findAll() {
        return new ResponseEntity<>(scheduleService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/schedule/{id}")
    @ApiOperation(value = "Get scheduling by param")
    public ResponseEntity<ScheduleResponseDTO> findByParam(@PathVariable UUID id) {
        return new ResponseEntity<>(scheduleService.findById(id), HttpStatus.OK);
    }

    @PostMapping(path = "/schedule")
    @ApiOperation(value = "Make a scheduling")
    public ResponseEntity<String> store(@RequestBody ScheduleRequestDTO scheduleRequestDTO) {
        scheduleService.store(scheduleRequestDTO);
        return new ResponseEntity<>("Schedule successfully saved", HttpStatus.OK);
    }

    @PutMapping(path = "/schedule/{id}")
    @ApiOperation(value = "Update a scheduling")
    public ResponseEntity<String> update(@RequestBody ScheduleRequestDTO scheduleRequestDTO) {
        scheduleService.update(scheduleRequestDTO);
        return new ResponseEntity<>("Scheduling changed successfully", HttpStatus.OK);
    }

    @DeleteMapping(path = "/schedule")
    @ApiOperation(value = "Delete a scheduling")
    public ResponseEntity<String> delete(@RequestBody ScheduleRequestDTO scheduleRequestDTO) {
        scheduleService.delete(scheduleRequestDTO);
        return new ResponseEntity<>("Scheduling successfully deleted", HttpStatus.OK);
    }
}

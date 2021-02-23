package com.br.scheduling.controller;

import com.br.scheduling.dto.Procedure.ProcedureRequestDTO;
import com.br.scheduling.dto.Procedure.ProcedureResponseDTO;
import com.br.scheduling.service.IProcedureService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api")
@Api
@CrossOrigin(origins = "*")
public class ProcedureController {

    @Autowired
    IProcedureService service;

    @GetMapping(path = "/procedure")
    @ApiOperation(value = "Get all procedure")
    public ResponseEntity<List<ProcedureResponseDTO>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/procedure/{id}")
    @ApiOperation(value = "Get procedure by id")
    public ResponseEntity<ProcedureResponseDTO> findById(@PathVariable UUID id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(path = "/procedure")
    @ApiOperation(value = "Register a procedure")
    public ResponseEntity<String> store(@RequestBody ProcedureRequestDTO procedureRequestDTO) {
        service.store(procedureRequestDTO);
        return new ResponseEntity<>("Procedure successfully saved", HttpStatus.OK);
    }

    @PutMapping(path = "/procedure")
    @ApiOperation(value = "Update a procedure")
    public ResponseEntity<String> update(@RequestBody ProcedureRequestDTO procedureRequestDTO) {
        service.update(procedureRequestDTO);
        return new ResponseEntity<>("Procedure changed successfully", HttpStatus.OK);
    }

    @DeleteMapping(path = "/procedure")
    @ApiOperation(value = "Delete a procedure")
    public ResponseEntity<String> delete(@RequestBody ProcedureRequestDTO procedureRequestDTO) {
        service.delete(procedureRequestDTO);
        return new ResponseEntity<>("Procedure successfully deleted", HttpStatus.OK);
    }
}

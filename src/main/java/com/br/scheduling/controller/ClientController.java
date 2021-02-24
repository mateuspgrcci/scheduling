package com.br.scheduling.controller;

import com.br.scheduling.dto.Client.ClientDTO;
import com.br.scheduling.dto.Procedure.ProcedureRequestDTO;
import com.br.scheduling.dto.Procedure.ProcedureResponseDTO;
import com.br.scheduling.service.IClientService;
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
public class ClientController {

    @Autowired
    IClientService service;

    @GetMapping(path = "/client")
    @ApiOperation(value = "Get all client")
    public ResponseEntity<List<ClientDTO>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/client/{id}")
    @ApiOperation(value = "Get client by id")
    public ResponseEntity<ClientDTO> findById(@PathVariable UUID id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping(path = "/client")
    @ApiOperation(value = "Register a client")
    public ResponseEntity<String> store(@RequestBody ClientDTO clientDTO) {
        service.store(clientDTO);
        return new ResponseEntity<>("Client successfully saved", HttpStatus.OK);
    }

    @PutMapping(path = "/client")
    @ApiOperation(value = "Update a client")
    public ResponseEntity<String> update(@RequestBody ClientDTO clientDTO) {
        service.update(clientDTO);
        return new ResponseEntity<>("Client changed successfully", HttpStatus.OK);
    }

    @DeleteMapping(path = "/client")
    @ApiOperation(value = "Delete a client")
    public ResponseEntity<String> delete(@RequestBody ClientDTO clientDTO) {
        service.delete(clientDTO);
        return new ResponseEntity<>("Client successfully deleted", HttpStatus.OK);
    }
}

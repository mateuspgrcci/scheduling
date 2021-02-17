package com.br.scheduling.controller;

import com.br.scheduling.dto.Professional.ProfessionalDTO;
import com.br.scheduling.service.IProfessionalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
@Api(value = "Scheduling API REST")
@CrossOrigin(origins = "*")
public class ProfessionalController {

    @Autowired
    IProfessionalService service;

    @GetMapping(path = "/professional")
    @ApiOperation(value = "Get all professional")
    public ResponseEntity<String> findAll() {
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

    @PostMapping(path = "/professional")
    @ApiOperation(value = "Register a professional")
    public ResponseEntity<String> store(@RequestBody ProfessionalDTO professionalDTO) {
        service.store(professionalDTO);
        return new ResponseEntity<>("Schedule successfully saved", HttpStatus.OK);
    }
}

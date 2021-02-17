package com.br.scheduling.dto;

import com.br.scheduling.dto.Professional.ProfessionalDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDTO implements Serializable {

    private UUID id;

    private String name;

    private float price;

    private String time;

    private boolean active;

    private ProfessionalDTO professionalDTO;
}

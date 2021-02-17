package com.br.scheduling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDTO {

    private Long id;

    private String name;

    private float price;

    private String time;

    private boolean active;

    private ProfessionalDTO professionalDTO;
}

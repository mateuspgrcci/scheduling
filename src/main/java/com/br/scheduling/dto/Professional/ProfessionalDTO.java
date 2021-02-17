package com.br.scheduling.dto.Professional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfessionalDTO implements Serializable {

    private UUID id;

    private String name;

    private boolean active;
}

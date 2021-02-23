package com.br.scheduling.dto.Procedure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcedureResponseDTO implements Serializable {

    private UUID id;

    private String name;

    private float price;

    private String timing;

    private Boolean active;

    private String professionalName;
}

package com.br.scheduling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private Long id;

    private String name;

    private String lastName;

    private String cpf;

    private String email;

    private String phone;

    private String gender;

    private boolean active;
}

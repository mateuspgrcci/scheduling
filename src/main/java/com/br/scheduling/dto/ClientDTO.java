package com.br.scheduling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO implements Serializable {

    private UUID id;

    private String name;

    private String lastName;

    private String cpf;

    private String email;

    private String phone;

    private String gender;

    private boolean active;
}

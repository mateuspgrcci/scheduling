package com.br.scheduling.dto.Schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleResponseDTO implements Serializable {

    private UUID id;

    private LocalDateTime date;

    private String status;

    private String professionalName;

    private String serviceName;

    private String clientName;

    private String clientPhone;
}

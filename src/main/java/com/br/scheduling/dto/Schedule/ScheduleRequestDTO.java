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
public class ScheduleRequestDTO implements Serializable {

    private UUID id;

    private LocalDateTime date;

    private String status;

    private UUID professionalId;

    private UUID serviceId;

    private UUID clientId;

    private boolean active;
}

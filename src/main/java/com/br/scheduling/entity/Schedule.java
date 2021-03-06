package com.br.scheduling.entity;

import com.br.scheduling.util.BooleanConverter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "db", name = "Schedule")
@Where(clause = "active = 1")
public class Schedule implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, unique = true, updatable = false)
    private UUID id;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm")
    private LocalDateTime date;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    @Convert(converter = BooleanConverter.class)
    private Boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service", nullable = false)
    private Procedure procedure;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professional", nullable = false)
    private Professional professional;
}

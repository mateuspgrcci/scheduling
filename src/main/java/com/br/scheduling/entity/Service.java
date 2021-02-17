package com.br.scheduling.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "db", name = "Service")
public class Service {
    @Id
    @SequenceGenerator(name="service_seq", sequenceName="db.service_id_seq", allocationSize=1)
    @GeneratedValue(generator="service_seq", strategy=GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private String time;

    @Column(nullable = false)
    private boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professional", nullable = false)
    private Professional professional;
}

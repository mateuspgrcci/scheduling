package com.br.scheduling.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "db", name = "Professional")
public class Professional {
    @Id
    @SequenceGenerator(name="professional_seq", sequenceName="db.professional_id_seq", allocationSize=1)
    @GeneratedValue(generator="professional_seq", strategy=GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean active;
}

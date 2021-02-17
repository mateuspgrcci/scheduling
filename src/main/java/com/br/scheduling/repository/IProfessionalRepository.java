package com.br.scheduling.repository;

import com.br.scheduling.entity.Professional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IProfessionalRepository extends JpaRepository<Professional, UUID> {
}

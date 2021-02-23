package com.br.scheduling.repository;

import com.br.scheduling.entity.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IProcedureRepository extends JpaRepository<Procedure, UUID> {
}

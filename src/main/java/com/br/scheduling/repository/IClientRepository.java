package com.br.scheduling.repository;

import com.br.scheduling.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IClientRepository extends JpaRepository<Client, UUID> {
}

package com.una.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.una.client.entity.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}

package com.authorization.repositories;

import com.authorization.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface AddressRepository extends JpaRepository<Address, UUID> {
}

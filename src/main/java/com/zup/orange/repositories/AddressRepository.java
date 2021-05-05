package com.zup.orange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zup.orange.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

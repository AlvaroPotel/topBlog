package com.zup.orange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zup.orange.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

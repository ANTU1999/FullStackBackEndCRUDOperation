package com.restapi.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

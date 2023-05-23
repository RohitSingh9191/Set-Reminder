package com.pew.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pew.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer>
{
}

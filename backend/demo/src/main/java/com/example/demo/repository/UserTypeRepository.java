package com.example.demo.repository;

import com.example.demo.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Long> 
{
}

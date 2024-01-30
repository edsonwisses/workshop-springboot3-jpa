package com.webservicespringjpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservicespringjpa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

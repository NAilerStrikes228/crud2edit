package com.kata.springbootkata.dao;

import com.kata.springbootkata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {
}

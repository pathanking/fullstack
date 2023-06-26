package com.srkr.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srkr.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

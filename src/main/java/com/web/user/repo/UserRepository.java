package com.web.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

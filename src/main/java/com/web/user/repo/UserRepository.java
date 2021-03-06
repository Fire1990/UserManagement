package com.web.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.user.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

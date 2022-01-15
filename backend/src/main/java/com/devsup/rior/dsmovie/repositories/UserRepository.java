package com.devsup.rior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsup.rior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}

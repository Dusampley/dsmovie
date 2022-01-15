package com.devsup.rior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsup.rior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

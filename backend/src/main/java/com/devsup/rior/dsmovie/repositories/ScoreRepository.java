package com.devsup.rior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsup.rior.dsmovie.entities.Score;
import com.devsup.rior.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
	
}

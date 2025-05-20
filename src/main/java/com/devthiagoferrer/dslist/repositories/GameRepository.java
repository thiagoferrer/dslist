package com.devthiagoferrer.dslist.repositories;

import com.devthiagoferrer.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

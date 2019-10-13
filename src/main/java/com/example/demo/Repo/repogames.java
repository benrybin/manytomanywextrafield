package com.example.demo.Repo;

import com.example.demo.Models.GamerGroupGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repogames extends JpaRepository<GamerGroupGame,Integer> {
}

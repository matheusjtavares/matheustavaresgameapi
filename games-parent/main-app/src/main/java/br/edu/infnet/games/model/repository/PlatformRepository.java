package br.edu.infnet.games.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.games.model.domain.Platform;


public interface PlatformRepository extends JpaRepository<Platform, Integer> {
    // Exact match
    Platform findByName(String name);

}
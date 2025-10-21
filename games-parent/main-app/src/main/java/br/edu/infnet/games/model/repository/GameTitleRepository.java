package br.edu.infnet.games.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.games.model.domain.GameTitle;
import br.edu.infnet.games.model.domain.Platform;

public interface GameTitleRepository extends JpaRepository<GameTitle, Integer>{
    List<GameTitle> findByPublisher(String publisher);
    List<GameTitle> findByNameContaining(String nameString);
    List<GameTitle> findByNameStartingWith(String nameString);
    List<GameTitle> findByNameEndingWith(String nameString);
    List<GameTitle> findByPlatform(Platform platform);
    GameTitle findByName(String name);
}

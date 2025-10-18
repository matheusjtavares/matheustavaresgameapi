package br.edu.infnet.games.dto;

import java.time.LocalDate;

import br.edu.infnet.games.model.domain.GameTitle;
import br.edu.infnet.games.model.domain.Platform;

public class GameTitleResponseDTO {
    private int id;
    private String name;
    private String publisher;
    private Platform platform;
    private LocalDate releaseDate;
    private Float version;
    private Boolean isActive;
    private String game_title;
    
    public GameTitleResponseDTO(GameTitle gameTitle) {
        gameTitle.setId(gameTitle.getId());
        gameTitle.setName(gameTitle.getName());
        gameTitle.setPublisher(gameTitle.getPublisher());
        gameTitle.setPlatform(gameTitle.getPlatform());
        gameTitle.setReleaseDate(gameTitle.getReleaseDate());
        gameTitle.setVersion(gameTitle.getVersion());
        gameTitle.setIsActive(gameTitle.getIsActive());
        gameTitle.setGame_title(gameTitle.getGame_title());
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Platform getPlatform() {
        return platform;
    }
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    public Float getVersion() {
        return version;
    }
    public void setVersion(Float version) {
        this.version = version;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public String getGame_title() {
        return game_title;
    }
    public void setGame_title(String game_title) {
        this.game_title = game_title;
    }


}


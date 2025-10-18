package br.edu.infnet.games.model.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GameTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String publisher;
    private Long platform;
    private LocalDate releaseDate;
    private Float version;
    private Boolean isActive;
    private String game_title;


    @Override
    public String toString() {
        String formatString = " Title: %s%n Publisher: %s%n Platform: %s%n Release Date: %s%n Version: % .1f" ;
        return String.format(formatString, name,publisher,platform,releaseDate,version);
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


    public Long getPlatform() {
        return platform;
    }


    public void setPlatform(Long platform) {
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


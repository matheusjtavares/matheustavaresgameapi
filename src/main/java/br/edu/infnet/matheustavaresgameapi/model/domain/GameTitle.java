package br.edu.infnet.matheustavaresgameapi.model.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GameTitle {
    private String game_title;
    private String publisher;
    private LocalDate releaseDate;
    private Float version;
    private Boolean isActive;
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
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


package br.edu.infnet.games.model.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class GameTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique=false,length = 100)
    private String name;
    @Column(unique=false, nullable = true)
    private String publisher;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference("platform-gameTitles")
    private Platform platform;

    @Column(unique=false, nullable = true)
    private LocalDate releaseDate;
    @Column(unique=false, nullable = true)
    private Float version;
    @Column(unique=false, nullable = true)
    private Boolean isActive;
    @Column(unique=false, nullable = true)
    private String game_title;

    @Override
    public String toString() {
        String formatString = " Title: %s%n Publisher: %s%n Platform: %s%n Release Date: %s%n Version: % .1f" ;
        return String.format(formatString, name,publisher,platform,releaseDate,version);
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
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


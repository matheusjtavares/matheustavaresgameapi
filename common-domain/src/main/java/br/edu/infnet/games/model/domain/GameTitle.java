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
    private Integer id;
    private String name;
    private String publisher;
    private Platform platform;
    private LocalDate releaseDate;
    private Float version;
    private Boolean isActive;


    @Override
    public String toString() {
        String formatString = " Title: %s%n Publisher: %s%n Platform: %s%n Release Date: %s%n Version: % .1f" ;
        return String.format(formatString, name,publisher,platform,releaseDate,version);
    }

}


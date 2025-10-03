package br.edu.infnet.matheustavaresapi.model.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

public class GameCopy {
    private Integer id;
    private String gameTitle;
    private LocalDate ownedSinceDate;
    private String player;
    private boolean isForRental;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getGameTitle() {
        return gameTitle;
    }
    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }
    public LocalDate getOwnedSinceDate() {
        return ownedSinceDate;
    }
    public void setOwnedSinceDate(LocalDate ownedSinceDate) {
        this.ownedSinceDate = ownedSinceDate;
    }
    public String getPlayer() {
        return player;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public boolean isForRental() {
        return isForRental;
    }
    public void setForRental(boolean isForRental) {
        this.isForRental = isForRental;
    }

    
}

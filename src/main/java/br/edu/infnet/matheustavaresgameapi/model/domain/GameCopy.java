package br.edu.infnet.matheustavaresgameapi.model.domain;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import br.edu.infnet.matheustavaresgameapi.model.domain.exceptions.GameCopyInvalidException;

public class GameCopy {
    private Integer id;
    private String gameTitle;
    private LocalDate ownedSinceDate;
    private String player;
    private BigDecimal rentalPrice;
    private boolean isForRental;
    private int maxRentalDays;

    public GameCopy(Integer id, String gameTitle, LocalDate ownedSinceDate, String player, BigDecimal rentalPrice,
            boolean isForRental, int maxRentalDays) {
        setId(id);
        setOwnedSinceDate(ownedSinceDate);
        this.gameTitle = gameTitle;
        this.player = player;
        this.rentalPrice = rentalPrice;
        this.isForRental = isForRental;
        this.maxRentalDays = maxRentalDays;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        if (id <= 0) {
            throw new GameCopyInvalidException("Id must be greater than 1");
        }
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
        if (ownedSinceDate.isAfter(LocalDate.now())) {
            throw new GameCopyInvalidException("Cannnot be owned in the future");
        }
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

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(BigDecimal rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getMaxRentalDays() {
        return maxRentalDays;
    }

    public void setMaxRentalDays(int maxRentalDays) {
        this.maxRentalDays = maxRentalDays;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same reference
        if (o == null || getClass() != o.getClass()) return false;
        GameCopy gameCopy = (GameCopy) o;
        return isForRental == gameCopy.isForRental &&
               maxRentalDays == gameCopy.maxRentalDays &&
               Objects.equals(id, gameCopy.id) &&
               Objects.equals(gameTitle, gameCopy.gameTitle) &&
               Objects.equals(ownedSinceDate, gameCopy.ownedSinceDate) &&
               Objects.equals(player, gameCopy.player) &&
               Objects.equals(rentalPrice, gameCopy.rentalPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gameTitle, ownedSinceDate, player, rentalPrice, isForRental, maxRentalDays);
    }
}

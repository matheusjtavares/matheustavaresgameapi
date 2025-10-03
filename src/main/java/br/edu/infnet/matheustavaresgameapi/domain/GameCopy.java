package br.edu.infnet.matheustavaresgameapi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

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
        this.id = id;
        this.gameTitle = gameTitle;
        this.ownedSinceDate = ownedSinceDate;
        this.player = player;
        this.rentalPrice = rentalPrice;
        this.isForRental = isForRental;
        this.maxRentalDays = maxRentalDays;
    }

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

    
}

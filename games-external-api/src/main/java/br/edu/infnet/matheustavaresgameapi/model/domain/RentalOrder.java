package br.edu.infnet.matheustavaresgameapi.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RentalOrder {
    private List<GameCopy> rentalCart;
    private int rentalDays;

    public List<GameCopy> getRentalCart() {
        return rentalCart;
    }

    public void setRentalCart(List<GameCopy> rentalCart) {
        this.rentalCart = new ArrayList<GameCopy>();
        for (GameCopy gameCopy : rentalCart) {
            if (gameCopy.getMaxRentalDays()>=rentalDays && gameCopy.isForRental()
                && !this.rentalCart.contains(gameCopy)){
                this.rentalCart.add(gameCopy);
            } 
        }
    }
    public BigDecimal getTotalRentalPrice(){
        BigDecimal totalPrice = new BigDecimal(0);
        for (GameCopy gameCopy : rentalCart) {
            totalPrice = totalPrice.add(gameCopy.getRentalPrice());
        }
        return totalPrice;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
}

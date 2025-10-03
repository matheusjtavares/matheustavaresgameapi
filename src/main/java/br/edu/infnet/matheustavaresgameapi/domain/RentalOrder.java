package br.edu.infnet.matheustavaresgameapi.domain;

import java.math.BigDecimal;
import java.util.List;

public class RentalOrder {
    private List<GameCopy> rentalCart;
    private int rentalDays;

    public List<GameCopy> getRentalCart() {
        return rentalCart;
    }

    public void setRentalCart(List<GameCopy> rentalCart) {
        this.rentalCart = rentalCart;
    }
    public BigDecimal getTotalRentalPrice(){
        return null;

    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
}

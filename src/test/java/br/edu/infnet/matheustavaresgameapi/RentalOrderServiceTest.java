package br.edu.infnet.matheustavaresgameapi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.edu.infnet.matheustavaresgameapi.model.domain.GameCopy;
import br.edu.infnet.matheustavaresgameapi.model.domain.RentalOrder;
import br.edu.infnet.matheustavaresgameapi.model.service.RentalOrderService;

public class RentalOrderServiceTest {
    @BeforeEach
    void setUp(){
        
    }
    @Test
    @DisplayName("Must return true when the total price in cart is greater than 0")
    public void mustReturnTrue_whenRentalCartHasItems(){
        LocalDate currentDate = LocalDate.now();
        GameCopy gameCopy1 = new GameCopy(1, "Final Fantasy 2",currentDate,"Matheus", new BigDecimal(10), true,10);        
        GameCopy gameCopy2 = new GameCopy(2, "Final Fantasy",currentDate,"Matheus", new BigDecimal(10), true,10);
        List<GameCopy> rentalCart = new ArrayList<>();
        rentalCart.add(gameCopy1);
        rentalCart.add(gameCopy2);
        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setRentalDays(10);
        rentalOrder.setRentalCart(rentalCart);
        RentalOrderService rentalOrderService = new RentalOrderService();
        assertTrue(rentalOrderService.persistRentalOrder(rentalOrder));
    }
    @Test
    @DisplayName("Must return false when the total price in cart is less than 0")
    public void mustReturnFalse_whenRentalCartIsEmpty(){
        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setRentalCart(new ArrayList<>());
        RentalOrderService rentalOrderService = new RentalOrderService();
        assertFalse(rentalOrderService.persistRentalOrder(rentalOrder));
        
    }
}

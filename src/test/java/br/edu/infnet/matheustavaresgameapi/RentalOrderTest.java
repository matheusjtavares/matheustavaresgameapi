package br.edu.infnet.matheustavaresgameapi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.edu.infnet.matheustavaresgameapi.domain.GameCopy;
import br.edu.infnet.matheustavaresgameapi.domain.RentalOrder;

public class RentalOrderTest {
    @BeforeEach
    void setUp(){
        
    }
    @Test
    @DisplayName("Must Calculate Rental Total Price when given valid game copies")
    void mustCalculateRentalPrice_whenRentalCartValid(){
        LocalDate currentDate = LocalDate.now();
        GameCopy gameCopy1 = new GameCopy(null, null, currentDate, null, null, false, 0);
        gameCopy1.setId(1);
        gameCopy1.setGameTitle("Final Fantasy");
        gameCopy1.setOwnedSinceDate(currentDate);
        gameCopy1.setRentalPrice(new BigDecimal(10));
        gameCopy1.setForRental(true);
        gameCopy1.setPlayer("Matheus");
        gameCopy1.setMaxRentalDays(10);
        
        GameCopy gameCopy2 = new GameCopy(2, "Final Fantasy",currentDate,"Matheus", new BigDecimal(10), true,10);
        List<GameCopy> rentalCart = new ArrayList<>();
        rentalCart.add(gameCopy1);
        rentalCart.add(gameCopy2);
        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setRentalDays(10);
        rentalOrder.setRentalCart(rentalCart);
        BigDecimal estimatedRentalOrderPrice = new BigDecimal(20); 
        BigDecimal actualRentalOrderPrice = rentalOrder.getTotalRentalPrice();
        assertEquals(gameCopy1.getId(),1,"Id must be 1");
        assertEquals(gameCopy1.getGameTitle(),"Final Fantasy","Game Title must be Final Fantasy");
        assertEquals(gameCopy1.getOwnedSinceDate(),currentDate,"Date must be now");
        assertEquals(gameCopy1.getRentalPrice(), new BigDecimal(10),"Price must be 10");
        assertEquals(gameCopy1.isForRental(),true,"Must be available for rental");
        assertEquals(gameCopy1.getMaxRentalDays(),10,"Max Rental Days must be 10");
        assertEquals(gameCopy1.getPlayer(),"Matheus","Player must be Matheus");
        assertEquals(rentalOrder.getRentalDays(),10,"Order Rental Days must be 10");
        assertEquals(estimatedRentalOrderPrice,actualRentalOrderPrice,"Rental Order price must be 20.00 for the current collection of games");

    }
    @Test
    @DisplayName("Must Return zero with empty rental cart")
    void mustReturnZero_whenRentalCartIsEmpty(){
        List<GameCopy> rentalCart = new ArrayList<>();
        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setRentalCart(rentalCart);
        BigDecimal estimatedRentalOrderPrice = new BigDecimal(0); 
        BigDecimal actualRentalOrderPrice = rentalOrder.getTotalRentalPrice();
        assertEquals(estimatedRentalOrderPrice,actualRentalOrderPrice,"Rental Order price must be 0 for the current collection of games");
    }
    @Test
    @DisplayName("Must prevent set when maximum dayus are exceeded")
    void mustPreventSet_whenRentalPeriodExcceedsMaximumDays(){
        GameCopy gameCopy = new GameCopy(1, "Final Fantasy",LocalDate.now(),"Matheus", new BigDecimal(10), true,10);
        List<GameCopy> rentalCart = new ArrayList<>();
        rentalCart.add(gameCopy);
        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setRentalDays(20);
        rentalOrder.setRentalCart(rentalCart);
        List<GameCopy> expectedRentalCart = new ArrayList<>(); 
        assertEquals(expectedRentalCart,rentalOrder.getRentalCart(),"Rental Cart Must be empty");
    }
    @Test
    @DisplayName("Must prevent set when not available for rental")
    void mustPreventSet_whenIsForRentalIsFalse(){
        GameCopy gameCopy = new GameCopy(1, "Final Fantasy",LocalDate.now(),"Matheus", new BigDecimal(10), false,10);
        List<GameCopy> rentalCart = new ArrayList<>();
        rentalCart.add(gameCopy);
        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setRentalDays(5);
        rentalOrder.setRentalCart(rentalCart);
        List<GameCopy> expectedRentalCart = new ArrayList<>(); 
        assertEquals(expectedRentalCart,rentalOrder.getRentalCart(),"Rental Cart Must be empty");
    }
    @Test
    @DisplayName("Must prevent set when duplicates are added to rental")
    void mustPreventSet_whenDuplicatedCopiesAreAddedToRentalCart(){
        GameCopy gameCopy = new GameCopy(1, "Final Fantasy",LocalDate.now(),"Matheus", new BigDecimal(10), true,10);
        List<GameCopy> rentalCart = new ArrayList<>();
        rentalCart.add(gameCopy);
        rentalCart.add(gameCopy);
        RentalOrder rentalOrder = new RentalOrder();
        rentalOrder.setRentalDays(5);
        rentalOrder.setRentalCart(rentalCart);
        List<GameCopy> expectedRentalCart = new ArrayList<>(); 
        expectedRentalCart.add(gameCopy);
        assertEquals(expectedRentalCart,rentalOrder.getRentalCart(),"Rental Cart Must have a single game copy");
    }
}

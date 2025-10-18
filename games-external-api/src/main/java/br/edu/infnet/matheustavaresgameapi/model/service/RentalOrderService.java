package br.edu.infnet.matheustavaresgameapi.model.service;

import java.util.List;

import br.edu.infnet.matheustavaresgameapi.model.domain.GameCopy;
import br.edu.infnet.matheustavaresgameapi.model.domain.RentalOrder;

public class RentalOrderService {
    public boolean persistRentalOrder(RentalOrder rentalOrder){
        List<GameCopy> rentalCart = rentalOrder.getRentalCart();
        return rentalCart.size()>=1;
    }
}

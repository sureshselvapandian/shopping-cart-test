package com.eshopping.shoppingcart.basket;

import java.math.BigDecimal;

import com.eshopping.shoppingcart.basket.entities.Basket;
import com.eshopping.shoppingcart.exception.ValidationException;

/**
 * @author suresh
 *
 */
public interface BasketManager {
	
    /**
     * Compute total price for the entire basket items.
     * @param basket
     * @return
     * @throws ValidationException
     */
    public BigDecimal computeBasketTotal(Basket basket) throws ValidationException;

}
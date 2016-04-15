package com.eshopping.shoppingcart.basket;

import java.math.BigDecimal;

import com.eshopping.shoppingcart.basket.entities.Basket;
import com.eshopping.shoppingcart.basket.entities.BasketItem;
import com.eshopping.shoppingcart.exception.ValidationException;

/**
 * This class compute total cost of all items in the given basket
 * @author suresh
 * 
 */
public class BasketManagerImpl implements BasketManager {
	
	/*
	 * When calculating basket total check for null basket, null basket items and empty baskets 
	 * 
	 * @see
	 * com.ecart.eshopping.basket.BasketManager#computeBasketTotal(com.ecart.
	 * eshopping.basket.entities.Basket)
	 */
	public BigDecimal computeBasketTotal(final Basket basket) {
		BigDecimal totalBasketPrice = BigDecimal.ZERO;

		if (basket == null || basket.getItemsInBasket() == null || basket.getItemsInBasket().isEmpty())
			throw new ValidationException("Basket cannot be Null And Should have Items in it");

		for (BasketItem basketItem : basket.getItemsInBasket()) {
			if (basketItem == null)
				throw new ValidationException("Item cannot be null");
			if (basketItem.getPrice() == null || basketItem.getPrice() == BigDecimal.ZERO)
				throw new ValidationException("Price should be available and Not equal to Zero " + basketItem.getItemName());
			totalBasketPrice = totalBasketPrice.add(basketItem.getPrice().multiply(new BigDecimal(basketItem.getQuantity())));
		}
		return totalBasketPrice;
	}



}

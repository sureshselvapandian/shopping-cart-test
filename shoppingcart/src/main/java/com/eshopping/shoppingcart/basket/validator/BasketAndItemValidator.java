package com.eshopping.shoppingcart.basket.validator;

import java.math.BigDecimal;

import com.eshopping.shoppingcart.basket.entities.Basket;
import com.eshopping.shoppingcart.basket.entities.BasketItem;
import com.eshopping.shoppingcart.exception.ValidationException;

/**
 * Validates basket and basket items.
 * @author suresh
 *
 */

public class BasketAndItemValidator {
	
	/**
	 * Validate Basket And BasketItemList
	 * 
	 * @param basket
	 */
	public void validateBasketAndBasketItemList(final Basket basket) {
		if (basket == null || basket.getItemsInBasket() == null || basket.getItemsInBasket().isEmpty())
			throw new ValidationException("Basket cannot be Null And Should have Items in it");
	}
	
	/**
	 * Validate basket item
	 * 
	 * @param basket
	 */
	public void validateBasketItem(final BasketItem item) {
		if (item == null)
			throw new ValidationException("Item cannot be Null");
	}

	/**
	 * Validate basket item price.
	 * Assumed Price cannot be zero or negative.
	 * 
	 * @param basketItem
	 */
	public void ensurePriceAvailableForItem(final BasketItem basketItem) {
		if (basketItem.getPrice() == null || basketItem.getPrice().compareTo(BigDecimal.ZERO) >= 0)
			throw new ValidationException(
					"Price should be available and Not equal to Zero or negative " + basketItem.getItemName());
	}

}

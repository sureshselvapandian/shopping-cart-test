package com.eshopping.shoppingcart.basket;

import java.math.BigDecimal;

import com.eshopping.shoppingcart.basket.entities.Basket;
import com.eshopping.shoppingcart.basket.entities.BasketItem;
import com.eshopping.shoppingcart.basket.validator.BasketAndItemValidator;

/**
 * This class compute total cost of all items in the given basket
 * @author suresh
 * 
 */
public class BasketManagerImpl implements BasketManager {
	
	private BasketAndItemValidator basketAndItemValidator;
	
	public BasketManagerImpl(BasketAndItemValidator validator){
		this.basketAndItemValidator = validator;
	}
	
	/*
	 * When calculating basket total check for null basket, null basket items and empty baskets 
	 * 
	 * @see
	 * com.ecart.eshopping.basket.BasketManager#computeBasketTotal(com.ecart.
	 * eshopping.basket.entities.Basket)
	 */
	public BigDecimal computeBasketTotal(final Basket basket) {
		BigDecimal totalBasketPrice = BigDecimal.ZERO;

		basketAndItemValidator.validateBasketAndBasketItemList(basket);

		for (BasketItem basketItem : basket.getItemsInBasket()) {
			basketAndItemValidator.validateBasketItem(basketItem);
			basketAndItemValidator.ensurePriceAvailableForItem(basketItem);
			totalBasketPrice = totalBasketPrice.add(calculatePriceForItem(basketItem));
		}
		return totalBasketPrice;
	}

	/**
	 * Calculate total price for an item
	 * 
	 * @param basketItem
	 * @return basketItem
	 */
	private BigDecimal calculatePriceForItem(final BasketItem basketItem) {
		return basketItem.getPrice().multiply(new BigDecimal(basketItem.getQuantity()));

	}
}

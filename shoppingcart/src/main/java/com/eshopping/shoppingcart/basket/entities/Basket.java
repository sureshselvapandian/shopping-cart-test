package com.eshopping.shoppingcart.basket.entities;


import java.util.ArrayList;
import java.util.List;

/**
 * Basket Entity class
 * @author suresh
 *
 */

public class Basket {
	
	protected List<BasketItem> basketItems = new ArrayList<BasketItem>();
	protected long basketID;
	
	/**
	 * Returns ID of this basket
	 * @return
	 */
	public long getBasketID() {
		return basketID;
	}
	
	/**
	 * Set basket id
	 */
	public void setBasketID(final long basketID) {
		this.basketID = basketID;
		
	}
	
	/**
	 * Add an item to the basket
	 * @param item
	 * @return
	 */
	
	public boolean addBasketItem(final BasketItem item) {
		return basketItems.add(item);
	}

	/**
	 * Gets the list of items
	 * @return
	 */
	public List<BasketItem> getItemsInBasket(){
		return basketItems;
	}
}

package com.eshopping.shoppingcart.basket.entities;

import java.math.BigDecimal;

/**
 * Peaches entity
 * @author suresh
 *
 */
public class Peaches implements BasketItem {
	
	String name = "Peaches";
	BigDecimal price = BigDecimal.valueOf(0.55);
	int quantity = 4;

	public String getItemName() {
		
		return name;
	}

	public void setItemName(final String name) {
		this.name = name;
		
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(final int quantity) {
		this.quantity = quantity;		
	}
}

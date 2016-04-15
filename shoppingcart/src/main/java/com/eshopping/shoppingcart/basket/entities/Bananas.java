package com.eshopping.shoppingcart.basket.entities;

import java.math.BigDecimal;

/**
 * Banana entity
 * @author suresh
 *
 */
public class Bananas implements BasketItem {
	
	String name = "Bananas";
	BigDecimal price = BigDecimal.valueOf(1.99);
	int quantity = 2;

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

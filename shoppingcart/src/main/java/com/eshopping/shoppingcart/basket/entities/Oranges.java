package com.eshopping.shoppingcart.basket.entities;

import java.math.BigDecimal;

/**
 * Oranges entity
 * @author suresh
 *
 */
public class Oranges implements BasketItem {
	
	String name = "Oranges";
	
	// TODO prices and quantity are hardcoded for test purpose.
	// TODO in production implementation this will be populated from database table or property files
	
	BigDecimal price = BigDecimal.valueOf(0.40);
	int quantity = 6;

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
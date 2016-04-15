package com.eshopping.shoppingcart.basket.entities;

import org.junit.*;

import com.eshopping.shoppingcart.basket.entities.Bananas;
import com.eshopping.shoppingcart.basket.entities.Basket;

import static org.junit.Assert.*;

/**
 * Test Basket class
 * 
 * @author suresh
 *
 */
public class BasketTest {

	private Basket basket;

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
	}

	/**
	 * Test item added to basket
	 */
	@Test
	public void testItemAddedToBasket() {
		basket.addBasketItem(new Bananas());
		assertEquals(1 , basket.getItemsInBasket().size() ) ;
	}
}

package com.eshopping.shoppingcart.basket.entities;

import org.junit.*;

import com.eshopping.shopping.helper.BasketItemsHelper;
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
	 * Test single item added to basket
	 */
	@Test
	public void testSingleItemaddedToBasket() {
		basket.addBasketItem(new Bananas());
		assertEquals(1 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of apples added to basket
	 */
	@Test
	public void testApplesAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getApples(2));
		assertEquals(2 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of bananas added to basket
	 */
	@Test
	public void testBananasAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getBananas(5));
		assertEquals(5 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of oranges added to basket
	 */
	@Test
	public void testOrangesAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getOranges(5));
		assertEquals(5 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of lemons added to basket
	 */
	@Test
	public void testLemonsAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getLemons(5));
		assertEquals(5 , basket.getItemsInBasket().size() ) ;
	}
	
	/**
	 * Test list of peaches added to basket
	 */
	@Test
	public void testPeachesAddedToBasket() {
		basket.addBasketItems(BasketItemsHelper.getPeaches(5));
		assertEquals(5 , basket.getItemsInBasket().size() ) ;
	}
}

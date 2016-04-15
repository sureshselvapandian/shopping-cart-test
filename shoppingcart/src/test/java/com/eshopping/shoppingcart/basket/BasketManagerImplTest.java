package com.eshopping.shoppingcart.basket;

import com.eshopping.shopping.helper.BasketItemsHelper;
import com.eshopping.shoppingcart.basket.entities.Basket;
import com.eshopping.shoppingcart.exception.ValidationException;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for BasketManagerImpl
 * @author suresh
 *
 */

public class BasketManagerImplTest {

	Basket basket;
	BasketManagerImpl basketManagerImpl;

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
		basketManagerImpl = new BasketManagerImpl();
	}

	/**
	 * Add five items to the basket and test the price calculated are expected.
	 * The prices are default in the fruits.
	 */
	@Test
	public void testCalculateBasketTotal() {
		try {
			basket.addBasketItems(BasketItemsHelper.getBananas(1));
			basket.addBasketItems(BasketItemsHelper.getApples(1));
			basket.addBasketItems(BasketItemsHelper.getOranges(1));
			basket.addBasketItems(BasketItemsHelper.getLemons(1));
			basket.addBasketItems(BasketItemsHelper.getPeaches(1));
			BigDecimal basketTotal = basketManagerImpl.computeBasketTotal(basket);
			Assert.assertEquals(14.76, basketTotal.doubleValue(), 0);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
	}

	/**
	 * Test a basket with no items and throw exception
	 */
	@Test(expected = ValidationException.class)
	public void testEmptyBasketAndThrowException() {
		basketManagerImpl.computeBasketTotal(basket);// basket is empty no item
														// added
	}

	/**
	 * Test when the basket is null and throw exception
	 */
	@Test(expected = ValidationException.class)
	public void testNullBasketAndThrowExpection() {
		basket = null; // basket is null
		basketManagerImpl.computeBasketTotal(basket);

	}

	/**
	 * Add a null item the basket and test for exception
	 */
	@Test(expected = ValidationException.class)
	public void testBasketForNullItemAndThrowException() {
		basket.addBasketItems(BasketItemsHelper.getBananas(1));
		basket.addBasketItem(null);// Add null item
		basketManagerImpl.computeBasketTotal(basket);
	}

}

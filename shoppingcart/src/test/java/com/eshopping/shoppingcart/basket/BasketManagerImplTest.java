package com.eshopping.shoppingcart.basket;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.eshopping.shopping.helper.BasketItemsHelper;
import com.eshopping.shoppingcart.basket.entities.Basket;
import com.eshopping.shoppingcart.basket.entities.BasketItem;
import com.eshopping.shoppingcart.basket.validator.BasketAndItemValidator;
import com.eshopping.shoppingcart.exception.ValidationException;

/**
 * Test for BasketManagerImpl
 * 
 * @author suresh
 *
 */

public class BasketManagerImplTest {

	Basket basket;
	BasketManagerImpl basketManagerImpl;
	BasketAndItemValidator basketAndItemValidatorMock;

	@Before
	public void setUp() throws Exception {
		basket = new Basket();
		basketAndItemValidatorMock = mock(BasketAndItemValidator.class);
		basketManagerImpl = new BasketManagerImpl(basketAndItemValidatorMock);
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
			verify(basketAndItemValidatorMock, times(1)).validateBasketAndBasketItemList(any(Basket.class));
			verify(basketAndItemValidatorMock, times(5)).validateBasketItem(any(BasketItem.class));
			verify(basketAndItemValidatorMock, times(5)).ensurePriceAvailableForItem(any(BasketItem.class));
			Assert.assertEquals(14.76, basketTotal.doubleValue(), 0);
		} catch (ValidationException e) {
			fail(" Test failed due to Validation exception ");
			e.printStackTrace();
		}
	}
	
	/**
	 * Test When ValidateBasketItem Throw Exception
	 */
	@Test(expected = ValidationException.class)
	public void testWhenValidateBasketItemThrowException() {
		doThrow(new ValidationException()).when(basketAndItemValidatorMock).validateBasketAndBasketItemList(basket);
		basketManagerImpl.computeBasketTotal(basket);//basket is empty no item added
	}
	
	/**
	 * Test When EnsurePriceAvailableForitem Throw Exception
	 */
	@Test(expected = ValidationException.class)
	public void testWhenEnsurePriceAvailableForitemThrowException() {
		basket.addBasketItems(BasketItemsHelper.getBananas(1));
		doThrow(new ValidationException()).when(basketAndItemValidatorMock).ensurePriceAvailableForItem(basket.getItemsInBasket().get(0));
		basketManagerImpl.computeBasketTotal(basket);

	}
	
}

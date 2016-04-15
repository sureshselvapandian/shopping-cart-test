package com.eshopping.shopping.helper;


import java.util.ArrayList;
import java.util.List;

import com.eshopping.shoppingcart.basket.entities.Apples;
import com.eshopping.shoppingcart.basket.entities.Bananas;
import com.eshopping.shoppingcart.basket.entities.BasketItem;
import com.eshopping.shoppingcart.basket.entities.Lemons;
import com.eshopping.shoppingcart.basket.entities.Oranges;
import com.eshopping.shoppingcart.basket.entities.Peaches;

/**
 * Helper to create list of basket items
 * @author selvaps
 *
 */
public final class BasketItemsHelper {
	
	/**
	 * Creates list of apples 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getApples(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Apples()); 
		}
		return basketItemList;
	}
	
	/**
	 * Creates list of oranges 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getOranges(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Oranges()); 
		}
		return basketItemList;
	}
	
	/**
	 * Creates list of bananas 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getBananas(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Bananas()); 
		}
		return basketItemList;
	}
	
	/**
	 * Creates list of lemons 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getLemons(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Lemons()); 
		}
		return basketItemList;
	}
	
	/**
	 * Creates list of Peaches 
	 * @param count
	 * @return List<BasketItem>
	 */
	public static List<BasketItem> getPeaches(final int count){
		List<BasketItem> basketItemList = new ArrayList<BasketItem>();
		
		for(int i = 0 ;i < count ; i++){
			basketItemList.add( new Peaches()); 
		}
		return basketItemList;
	}
}

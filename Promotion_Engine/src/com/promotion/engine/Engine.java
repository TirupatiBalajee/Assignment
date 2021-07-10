package com.promotion.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Engine {

	List<ActivePromotions> activePromotions = new ArrayList<ActivePromotions>();
	
	public static void main(String[] args) {
		
		Invertory invA = new Invertory();
		invA.setName("A");
		invA.setPrice((double) 50);
		
		Invertory invB = new Invertory();
		invB.setName("B");
		invB.setPrice((double) 30);
		
		Invertory invC = new Invertory();
		invC.setName("C");
		invC.setPrice((double) 20);
		
		Invertory invD = new Invertory();
		invD.setName("D");
		invD.setPrice((double) 15);		
		
	}
	
	//Method to calculate the TotalCost of the Cart
	public Double getTotalCostWithPromotion(Map<ArrayList<String>, Integer> promotionMapQuantity,Map<ArrayList<String>, Double> promotionMapCost, Map<Invertory,Integer> orderDetails, Map<Invertory,Double> inventoryPrice) {
		
		/* psudo logic implementation*/
		Double totalPrice = 0.0;
		Double inventoryCost = 0.0;
		int numberOfPromotion = 0;
		int reminderOfPromotion = 0;
		
		// iterate over OrderDetails object to get the list of Item and Quantity
		for(Map.Entry<Invertory, Integer> set : orderDetails.entrySet()) {
			
			inventoryCost = 0.0;
			numberOfPromotion = 0;
			reminderOfPromotion = 0;
			String item = set.getKey().getName();
			
			if(promotionMapQuantity.containsKey(item)) {
				
				//If the item is present do your logic 
				Integer promotionQuatity = promotionMapQuantity.get(item);
				Integer orderQuantity = set.getValue();
				inventoryCost = inventoryPrice.get(item);
				if(orderQuantity < promotionQuatity) {
					totalPrice = totalPrice + orderQuantity*inventoryCost;
				}
				else {
					numberOfPromotion = orderQuantity/promotionQuatity;
					reminderOfPromotion = orderQuantity % promotionQuatity;
					
					totalPrice = totalPrice + numberOfPromotion * promotionMapCost.get(item);
					totalPrice = totalPrice + reminderOfPromotion * inventoryCost;
				}
			}
		}
		
		return totalPrice;
	}
}

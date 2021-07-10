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
	public double getTotalCostWithPromotion(Map<ArrayList<String>, Double> promotionMap, Map<Invertory,Integer> orderDetails) {
		
		/* psudo logic implementation*/
		
		// iterate over OrderDetails object to get the list of Item and Quantity
		for(Map.Entry<Invertory, Integer> set : orderDetails.entrySet()) {
			if(promotionMap.containsKey(set.getKey().getName())) {
				//If the item is present do your logic 
			}
		}
		
		return 0.0;
	}
}

package com.promotion.engine;

import java.util.ArrayList;
import java.util.List;

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
	public double getTotalCostWithPromotion(ActivePromotions activePromotions, Cart cart) {
		
		return 0.0;
	}
}

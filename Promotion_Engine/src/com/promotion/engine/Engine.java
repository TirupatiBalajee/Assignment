package com.promotion.engine;

import java.util.ArrayList;
import java.util.List;

public class Engine {

	List<ActivePromotions> activePromotions = new ArrayList<ActivePromotions>();
	
	public static void main(String[] args) {
		
		Invertory invA = new Invertory();
		invA.setName("A");
		invA.setPrice(10);
		
		Invertory invB = new Invertory();
		invB.setName("B");
		invB.setPrice(5);
		
		Invertory invC = new Invertory();
		invC.setName("C");
		invC.setPrice(5);
		
		Invertory invD = new Invertory();
		invD.setName("D");
		invD.setPrice(5);
		
		
		
		
	}
}

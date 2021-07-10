package com.promotion.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ActivePromotions {

	
	public ActivePromotions(Map<ArrayList<String>, Double> promotionMap) {
		super();
		this.promotionMap = promotionMap;
	}

	private Map<ArrayList<String>, Double> promotionMap = new HashMap<ArrayList<String>, Double>();

	public Map<ArrayList<String>, Double> getPromotionMap() {
		return promotionMap;
	}

	public void setPromotionMap(Map<ArrayList<String>, Double> promotionMap) {
		this.promotionMap = promotionMap;
	}	
	
}

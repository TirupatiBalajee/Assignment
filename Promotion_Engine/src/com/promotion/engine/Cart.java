package com.promotion.engine;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	private Map<Invertory,Integer> orderDetails = new HashMap<Invertory,Integer>();

	public Map<Invertory,Integer> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Map<Invertory,Integer> orderDetails) {
		this.orderDetails = orderDetails;
	}
}

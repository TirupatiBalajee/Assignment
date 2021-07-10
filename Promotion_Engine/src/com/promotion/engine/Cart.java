package com.promotion.engine;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Invertory> orderDetails = new ArrayList<Invertory>();

	public List<Invertory> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<Invertory> orderDetails) {
		this.orderDetails = orderDetails;
	}
}

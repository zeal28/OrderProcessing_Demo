package com.OrderProcessing.bo;

import com.OrderProcessing.dto.Order;

public interface OrderBO {
	
	boolean placeOrder(Order order);

	boolean cancelOrder(int id);
	
	boolean deleteOrder(int id);
}

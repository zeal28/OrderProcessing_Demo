package com.OrderProcessing.doa;

import com.OrderProcessing.dto.Order;

public interface OrderDAO {

	int Create(Order order);
	
	Order read(int id);
	
	int update(Order order);
	
	int delete( int id);
	
	
}

package com.OrderProcessing.bo;

import com.OrderProcessing.doa.OrderDAO;
import com.OrderProcessing.dto.Order;

public class OrderBOimpl implements OrderBO {

	private OrderDAO dao;
	
	@Override
	public boolean placeOrder(Order order) {
		int create = dao.Create(order);
		if(create==0)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean cancelOrder(int id) {
		Order read = dao.read(id);
		read.setStatus("cancelled");
		int update = dao.update(read);
		if(update==0)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public boolean deleteOrder(int id) {
		int delete = dao.delete(id);
		if(delete==0){
			return false;
		}
		
		return true;
	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}

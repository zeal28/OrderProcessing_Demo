package com.OrderProcessing.bo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.OrderProcessing.bo.OrderBOimpl;
import com.OrderProcessing.doa.OrderDAO;
import com.OrderProcessing.doa.OrderDAOimpl;
import com.OrderProcessing.dto.Order;

import static org.mockito.Mockito.*;

public class OrderBOimplTest {
	
	@Mock
	OrderDAO dao;
	
	@Before
	
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
		OrderBOimpl obj= new OrderBOimpl();
		obj.setDao(dao);
		
		Order order=new Order();
		when(dao.Create(order)).thenReturn(new Integer(1));
		boolean result= obj.placeOrder(order);
		assertTrue(result);
		
	}

}

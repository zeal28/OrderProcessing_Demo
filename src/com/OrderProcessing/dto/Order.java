package com.OrderProcessing.dto;

public class Order {

	private int id;
	private String z;
	private String status;
	private int i;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getZ() {
		return z;
	}
	public void setZ(String z) {
		this.z = z;

	}
}

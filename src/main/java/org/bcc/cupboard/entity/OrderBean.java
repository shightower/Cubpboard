package org.bcc.cupboard.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderBean implements Order {
	private static final long serialVersionUID = -5893472014559954025L;
	private long orderNumber;
	private Date orderDate;
	private int tefapCount;
	private int numOfBags;
	private int orderWeight;
	private int isPending;
	private String orderType;
	private String customerFirstName;
	private String customerLastName;
	
	public OrderBean() {
		
	}
	
	public OrderBean(Order order) {
		setOrderNumber(order.getOrderNumber());
		setOrderDate(order.getOrderDate());
		setTefapCount(order.getTefapCount());
		setNumOfBags(order.getNumOfBags());
		setOrderWeight(order.getOrderWeight());
		setOrderType(order.getOrderType());
		setIsPending(order.getIsPending());
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderWeight() {
		return orderWeight;
	}

	public void setOrderWeight(int orderWeight) {
		this.orderWeight = orderWeight;
	}

	public String getOrderType() {
		return orderType;
	}
	
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	public boolean isTefap() {
		boolean isTefap = false;
		if(orderType.equalsIgnoreCase("tefap")) {
			isTefap = true;
		}
		
		return isTefap;
	}
	
	public int getIsPending() {
		return isPending;
	}
	
	public void setIsPending(int isPending) {
		this.isPending = isPending;
	}
	
	public boolean isPending() {
		boolean pending = false;
		
		if(isPending == 1) {
			pending = true;
		}
		
		return pending;
	}
	
	public int getTefapCount() {
		return tefapCount;
	}
	
	public void setTefapCount(int count) {
		this.tefapCount = count;
	}
	
	public int getNumOfBags() {
		return numOfBags;
	}
	
	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
}

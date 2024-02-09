package com.springmvc.mvc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="information1")
public class ProductInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Pname")
	private String Pname;
	
	@Column(name="CustId")
	private int CustId;
	
	@Column(name="location")
	private String Location;
	
	@Column(name="OrderStatus")
	private String OrderStatus;
	
	@Column(name="Cost")
	private int Cost;
	
	
	public ProductInfo() {
		
	}
	

	public ProductInfo(long id, String pname, int custId, String location, String orderStatus, int cost) {
		super();
		this.id = id;
		Pname = pname;
		CustId = custId;
		Location = location;
		OrderStatus = orderStatus;
		Cost = cost;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		CustId = custId;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}
	
	
	
	
	
}

package com.example.demo.entity;




import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name="PRICES")
@Entity


public class Prices {

	

	   

	@Id
	@Column(name = "PRICE_LIST")
	public int priceList;

	@Column(name = "START_DATE")
	public Date startDate;	
	
	@Column(name = "END_DATE")
	public Date endDate;	
	
	
	@Column(name = "PRODUCT_ID")
	public Integer productId;
	
	@Column(name = "PRIORITY")
	public Integer priority;
	
	@Column(name = "PRICE")
	public Double price;
	
	@Column(name = "CURR")
	public String currency;
	
	@ManyToOne
	private Cadena Cadena;


	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getPriceList() {
		return priceList;
	}

	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Cadena getCadena() {
		return Cadena;
	}

	public void setCadena(Cadena cadena) {
		Cadena = cadena;
	}









}

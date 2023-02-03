package com.example.demo.model;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.Prices;



public class informacionSalida {

	
	public long BRAND_ID;
	public Integer productId;
	public int priceList;
	public Double price;
	public Date startDate;	
	public Date endDate;
	

	public long getBRAND_ID() {
		return BRAND_ID;
	}
	public void setBRAND_ID(long bRAND_ID) {
		BRAND_ID = bRAND_ID;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public int getPriceList() {
		return priceList;
	}
	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
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
	
	public informacionSalida informarSalida(List<Prices> listaPrecios) {
		informacionSalida Bean = new informacionSalida();
				
		return Bean;
	}



}

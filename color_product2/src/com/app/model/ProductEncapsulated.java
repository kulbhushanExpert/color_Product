package com.app.model;

public class ProductEncapsulated {

	private String productName;
	
	private Double productPrize;
	
	private int prodId;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName= productName;
	}

	public Double getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(Double productPrize) {
		this.productPrize = productPrize;
	}

}

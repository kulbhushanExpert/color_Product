package com.app.model;

public class Customer {

	private int custId;
	private String custName;
	private ProductEncapsulated productEncapsulated;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public ProductEncapsulated getProductEncapsulated() {
		return productEncapsulated;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", productEncapsulated=" + productEncapsulated
				+ "]";
	}

	public void setProductEncapsulated(ProductEncapsulated productEncapsulated) {
		this.productEncapsulated = productEncapsulated;
	}

}

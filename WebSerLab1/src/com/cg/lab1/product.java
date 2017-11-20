package com.cg.lab1;
public class product 
{
	private int prodId;
	private String prodName;
	private double price;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int prodId, String prodName, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [prodId=" + prodId + ", prodName=" + prodName + ", price="
				+ price + "]";
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}

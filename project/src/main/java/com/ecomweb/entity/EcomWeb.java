package com.ecomweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EcomWeb {

	@Id
	private Integer product_id;
	private String product_name;
	private double product_price;
	private boolean stock;
	private Integer product_quantity;
	private boolean live;
	private String product_imgname;
	private String desc;

	public EcomWeb() {
		super();
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	public Integer getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(Integer product_quantity) {
		this.product_quantity = product_quantity;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public String getProduct_imgname() {
		return product_imgname;
	}

	public void setProduct_imgname(String product_imgname) {
		this.product_imgname = product_imgname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "EcomWeb [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", stock=" + stock + ", product_quantity=" + product_quantity + ", live=" + live
				+ ", product_imgname=" + product_imgname + ", desc=" + desc + "]";
	}

}

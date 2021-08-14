package com.gec.beans;

public class Product {
	   private String id;//产品id
	   private String productName;//产品名称
	   private String detail;//产品描述
	   private String provider;//供应商
	   private String price;//价格
	   private String sellTimes;//销售量
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSellTimes() {
		return sellTimes;
	}
	public void setSellTimes(String sellTimes) {
		this.sellTimes = sellTimes;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", detail=" + detail + ", provider=" + provider
				+ ", price=" + price + ", sellTimes=" + sellTimes + "]";
	}
	//用这个方法拆解字符串，根据属性值生成Product对象
	   public static Product newProduct(String LINE) {
		   Product p = new Product();
		   String[] data = LINE.split(",");
		   p.setId(data[0]);
		   p.setProductName(data[1]);
		   p.setDetail(data[2]);
		   p.setProvider(data[3]);
		   p.setPrice(data[4]);
		   p.setSellTimes(data[5]);
		   return p;
		}
	}


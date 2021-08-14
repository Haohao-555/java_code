package entity;

public class Product {
  private String product_id;//产品id
  private String product_name;//产品名字
  private double price;//产品价格
  private String info;//产品信息
  public Product(){
	  super();
  }
public String getProduct_id() {
	return product_id;
}
public void setProduct_id(String productId) {
	product_id = productId;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String productName) {
	product_name = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
  
}

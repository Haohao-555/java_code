package com.gec.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class Product {
   private int pro_id;//产品id
   private String pro_name;//产品名称
   private int pro_num;//产品数量
   private float pro_price;//产品价格
   private String pro_info;//产品介绍
   private String pro_type;//产品类型
   private String pro_situation;//产品产地
   private String createDate;//创建日期
   private String unit;//单位
   private String barCode;//条形码
   private String specification;//规格
   private float discountRate;//折扣
   private float memberPrice;//会员价
   
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
}
public String getBarcode() {
	return barCode;
}
public void setBarcode(String barCode) {
	this.barCode = barCode;
}
public String getSpecification() {
	return specification;
}
public void setSpecification(String specification) {
	this.specification = specification;
}
public float getDiscountRate() {
	return discountRate;
}
public void setDiscountRate(float discountRate) {
	this.discountRate = discountRate;
}
public float getMemberPrice() {
	return memberPrice;
}
public void setMemberPrice(float memberPrice) {
	this.memberPrice = memberPrice;
}
public String getCreateDate() {
	return this.createDate;
}
public void setCreateDate(String createDate) {
	this.createDate = createDate;
}   
public int getPro_id() {
	return pro_id;
}
public void setPro_id(int proId) {
	this.pro_id = proId;
}
public String getPro_name() {
	return this.pro_name;
}
public void setPro_name(String proName) {
	this.pro_name = proName;
}
public int getPro_num() {
	return this.pro_num;
}
public void setPro_num(int proNum) {
	this.pro_num = proNum;
}
public float getPro_price() {
	return this.pro_price;
}
public void setPro_price(float proPrice) {
	this.pro_price = proPrice;
}
public String getPro_info() {
	return this.pro_info;
}
public void setPro_info(String proInfo) {
	this.pro_info = proInfo;
}
public String getPro_type() {
	return this.pro_type;
}
public void setPro_type(String proType) {
	this.pro_type = proType;
}
public String getPro_situation() {
	return this.pro_situation;
}
public void setPro_situation(String proSituation) {
	this.pro_situation = proSituation;
}
public Product(ResultSet rs) throws SQLException{
	super();
	this.pro_id = rs.getInt("pro_id");
	this.pro_name =rs.getString("pro_name");
	this.pro_num =rs.getInt("pro_num");
	this.pro_price = rs.getFloat("pro_price");
	this.pro_info = rs.getString("pro_info");
	this.pro_type = rs.getString("pro_type");
	this.pro_situation = rs.getString("pro_situation");
	this.createDate = rs.getString("createDate");
	this.barCode=rs.getString("barCode");
	this.unit=rs.getString("unit");
	this.specification=rs.getString("specification");
	this.discountRate=rs.getFloat("discountRate");
	this.memberPrice=rs.getFloat("memberPrice");
}
public Product(){}
public Product(HttpServletRequest req){
	this.pro_name=req.getParameter("pro_name");
	this.pro_num=Integer.parseInt(req.getParameter("pro_num"));
	this.pro_price=Float.parseFloat(req.getParameter("pro_price"));
	this.pro_type=req.getParameter("pro_type");
	this.pro_situation=req.getParameter("pro_situation");
	this.pro_info=req.getParameter("pro_info");
	this.unit=req.getParameter("unit");
	this.specification=req.getParameter("specification");
	this.discountRate=Float.parseFloat(req.getParameter("discountRate"));
	this.memberPrice=discountRate*pro_price;
}
@Override
public String toString() {
	return "Product [barcode=" + barCode + ", createDate=" + createDate
			+ ", discountRate=" + discountRate + ", memberPrice=" + memberPrice
			+ ", pro_id=" + pro_id + ", pro_info=" + pro_info + ", pro_name="
			+ pro_name + ", pro_num=" + pro_num + ", pro_price=" + pro_price
			+ ", pro_situation=" + pro_situation + ", pro_type=" + pro_type
			+ ", specification=" + specification + ", unit=" + unit + "]";
}
 
}

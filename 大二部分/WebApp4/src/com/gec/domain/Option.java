package com.gec.domain;

public class Option {
   private String value;
   private String text;
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public Option(String value, String text) {
	super();
	this.value = value;
	this.text = text;
}
   
}

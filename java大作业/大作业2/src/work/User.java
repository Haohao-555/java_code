package work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class User {
private String name;
private  String id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public User(String name, String id) {
	super();
	this.name = name;
	this.id = id;
}
public void Uregister(String name,String id) throws Exception{
	if(name.equals("С��")&&id.equals("123123")){
		System.out.println("��¼�ɹ�");
	}else{
		throw new Exception("������û����������");
		}
}
public void zhuche(String name,String id) throws Exception{
	if(name.length()>10||id.length()>10){
		throw new Exception("�û��������벻�ܳ���10λ");
	}
}

 
}
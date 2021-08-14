package entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
    String name;//姓名
    String english_name;//英语姓名
    String age;//年龄
    String sex;//性别
    String address;//地址
    String description;//描述
public User(String name, String englishName, String age, String sex,
		String address, String description) {
	super();
	this.name = name;
	english_name = englishName;
	this.age = age;
	this.sex = sex;
	this.address = address;
	this.description = description;
}
   
}

package entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
    String name;//����
    String english_name;//Ӣ������
    String age;//����
    String sex;//�Ա�
    String address;//��ַ
    String description;//����
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

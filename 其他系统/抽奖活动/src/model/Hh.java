package model;

import java.util.Random;

public class Hh {
 public String choujian() throws Exception{
	Random rand=new Random();
	int id=rand.nextInt(100)+1;
	
		if(id%5==0){
			String detail="һ�Ƚ�";
			return detail;
		}else if(id%5==2){
			String detail="���Ƚ�";
			return detail;
		}else if(id%5==1){
			String detail="���Ƚ�";
			return detail;
		}else if(id%5==3){
			String detail="������";
			return detail;
		}
		else{
			throw new Exception("û���н���лл����");
		}

	}
 }


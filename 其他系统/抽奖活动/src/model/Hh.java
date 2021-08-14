package model;

import java.util.Random;

public class Hh {
 public String choujian() throws Exception{
	Random rand=new Random();
	int id=rand.nextInt(100)+1;
	
		if(id%5==0){
			String detail="一等奖";
			return detail;
		}else if(id%5==2){
			String detail="二等奖";
			return detail;
		}else if(id%5==1){
			String detail="三等奖";
			return detail;
		}else if(id%5==3){
			String detail="鼓励奖";
			return detail;
		}
		else{
			throw new Exception("没有中奖，谢谢参与");
		}

	}
 }


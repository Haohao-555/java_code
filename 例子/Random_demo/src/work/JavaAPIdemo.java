package work;

import java.util.Random;

public class JavaAPIdemo {
  public static void main(String[] args) {
	Random rand=new Random();
	int foot=0;
	int data []=new int [6];
	while(foot<6){
		int num=rand.nextInt(50);
		if(isuse(num,data)){
			data[foot++]=num;
		}
	}
	for(int i=0;i<data.length;i++){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(""+data[i]+" ");
	  }
   }
//ÅÐ¶ÏÊÇ·ñÖØ¸´
  public static boolean isuse(int num,int []temp){
	  if(num==0){
		  return false;
	  }
	  for(int i=0;i<temp.length;i++){
		  if(num==temp[i])
			  return false;
	  }
		return true;  
  }
    
}

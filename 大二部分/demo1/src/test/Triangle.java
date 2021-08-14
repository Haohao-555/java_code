package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
	private static ArrayList <Integer> arr = new ArrayList<Integer>();
	//输入三条边
	public static void print(){
		 for(int i=0; i<3;i++){
			 System.out.print("请输入第"+(i+1)+"条边为");
			 Scanner sca = new Scanner(System.in);
			 arr.add(sca.nextInt());
		 } 
	}
	
	//判断三角形
	public static int isTriangle(int a,int b,int c){
		if(a>0 && b>0 && c>0){
			//普通三角形
			if((a+b>c && Math.abs(a-b)<c) || (a+c>b && Math.abs(a-c)>b) || ((b+c>a && Math.abs(b-c)>a))){
				//等腰三角形
				if(a==b && b==c){
					return 2;
				}
				return 1;
			}
		}
		//不能构成三角形
		return -1;
		
	}
   public static void main(String[] args) {
	  print();
	  int flag=isTriangle(arr.get(0),arr.get(1),arr.get(2));
	  switch (flag) {
	     case -1:
		        System.out.println("不能构成三角形");
		        break;
	     case 2:
		       System.out.println("可以构成等边三角形");
		       break;
	     case 1:
		       System.out.println("可以构成一般三角形");
		       break;
	}
  }
}

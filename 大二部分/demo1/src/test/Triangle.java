package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
	private static ArrayList <Integer> arr = new ArrayList<Integer>();
	//����������
	public static void print(){
		 for(int i=0; i<3;i++){
			 System.out.print("�������"+(i+1)+"����Ϊ");
			 Scanner sca = new Scanner(System.in);
			 arr.add(sca.nextInt());
		 } 
	}
	
	//�ж�������
	public static int isTriangle(int a,int b,int c){
		if(a>0 && b>0 && c>0){
			//��ͨ������
			if((a+b>c && Math.abs(a-b)<c) || (a+c>b && Math.abs(a-c)>b) || ((b+c>a && Math.abs(b-c)>a))){
				//����������
				if(a==b && b==c){
					return 2;
				}
				return 1;
			}
		}
		//���ܹ���������
		return -1;
		
	}
   public static void main(String[] args) {
	  print();
	  int flag=isTriangle(arr.get(0),arr.get(1),arr.get(2));
	  switch (flag) {
	     case -1:
		        System.out.println("���ܹ���������");
		        break;
	     case 2:
		       System.out.println("���Թ��ɵȱ�������");
		       break;
	     case 1:
		       System.out.println("���Թ���һ��������");
		       break;
	}
  }
}

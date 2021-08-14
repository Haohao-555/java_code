package test;

import java.util.Scanner;

public class CountTax {
    public static float cost(float salary){
		if(salary>0){
    		if(salary<=500){
    			return (float) (salary *0.05);
    		}
    		if(salary>500 && salary<=2000){
    			return (float) (salary *0.1);
    		}
    		if(salary>2000 && salary<=5000){
    			return (float) (salary *0.15);
    		}
    		if(salary>5000 && salary<=20000){
    			return (float) (salary *0.20);
    		}
    		if(salary>20000 && salary<=40000){
    			return (float) (salary *0.25);
    		}
    		if(salary>40000 && salary<=60000){
    			return (float) (salary *0.30);
    		}
    		if(salary>60000 && salary<=80000){
    			return (float) (salary *0.35);
    		}
    		if(salary>80000 && salary<=100000){
    			return (float) (salary *0.40);
    		}
    		if(salary>10000){
    			return (float) (salary *0.45);
    		}
    		
    	}
    	return 0;
    }
   public static void main(String[] args) {
	// TODO Auto-generated method stub
	      System.out.print("«Î ‰»Î–ΩÀÆŒ™");
	      Scanner sca = new Scanner(System.in);
	      float money = sca.nextFloat();
	      float cost_money=cost(money-2000);
	      System.out.println(cost_money);
}
}

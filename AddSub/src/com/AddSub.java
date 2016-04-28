package com;

import java.util.Scanner;

public class AddSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
	    Integer number1;
	    Integer number2;
	  
		
		
		System.out.println("Please Enter 1st number:");  
		number1=c.nextInt();

		System.out.println("Please Enter 2nd number:");  
		number2=c.nextInt();
		System.out.println(number1+number2);
		if(number1>number2){
			System.out.println(number1-number2);
		}else{
			System.out.println(number2-number1);
		}
		
		
	}

}

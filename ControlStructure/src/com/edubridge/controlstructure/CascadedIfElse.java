package com.edubridge.controlstructure;

import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
		int num2 =s.nextInt();
		
		if (num>num2)
		{
			System.out.println("value of num is greater");
		}
		else if(num<num2)
		{
			System.out.println("value of num2 is greater");
		}
		else
		{
			System.out.println("Invaild input");
		}
		
	}

}

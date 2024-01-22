package com.edubridge.controlstructure;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age=s.nextInt();
		int weight = s.nextInt();
		if(age>=15)
		{
			if(weight>=45&&weight<=110)
			{
				System.out.println("your are ready to jump");
			}
			else
			{
				System.out.println("sorry its not allowed");
			}
		}
		else
		{
			System.out.println("sorry its not allowed");
		}

	}

}

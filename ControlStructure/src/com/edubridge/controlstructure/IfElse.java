package com.edubridge.controlstructure;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
		int num2 = s.nextInt();
		if (num == num2) {
			System.out.println("num is equal to num2");
		}
		else {
			System.out.println("num is not equal to num2");
		}
	}

}

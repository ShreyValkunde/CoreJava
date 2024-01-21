package com.edubridge.compileinput;
import java.util.Scanner;
public class IntegerDataTypes {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		float x =s.nextFloat();
		int y =s.nextInt();
		double z=s.nextDouble();
		s.nextLine();
		String str = s.nextLine();
		
		System.out.println(str);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		s.close();
	}

}

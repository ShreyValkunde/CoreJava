package com.edubridge.controlstructure;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int map_name =s.nextInt();
		switch ( map_name)
		{
		case 1 :
			System.out.println("Erangle");
			break;
		case 2 : 
			System.out.println("Miramar");
			break;
		case 3 : 
			System.out.println("Sanhok");
			break;
		case 4 : 
			System.out.println("Vikendi");
			break;
			
		}
		

	}

}

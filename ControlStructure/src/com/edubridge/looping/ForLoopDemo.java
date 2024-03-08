package com.edubridge.looping;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(i + " ");
		}
	}

}

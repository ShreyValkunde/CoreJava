package com.eb.main;

import java.util.Scanner;

import com.eb.dao.EmployeeDao;

import com.eb.pojo.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name:");
		
		String name = s.next();
		
		System.out.println("Welcome to Employee Management Portal"+" "+name);
		
		int ch=0;
		do
		{
			System.out.println("Press 1 Add Employee");
			System.out.println("Press 2 Update Employee");
			System.out.println("Press 3 Delete Employee");
			System.out.println("Press 4 Read Employee Records");
			System.out.println("Press 5 Exit");
			System.out.println("Enter Choice");
			ch=s.nextInt();
			switch (ch)
			{
			case 1:
				// Add Employee Details
				System.out.println("Enter Employee Name:");
				String sname = s.next();
				
				System.out.println("Enter Employee Designation:");
				String design = s.next();
				
				System.out.println("Enter Employee PhoneNo:");
				String ePhone = s.next();
				
				System.out.println("Enter Employee Address:");
				String address = s.next();
				
				System.out.println("Enter Employee Salary:");
				int salary = s.nextInt();
				
				Employee et = new Employee(sname,design,ePhone,address,salary);
				boolean ans = EmployeeDao.insertEmployeeData(et);
				System.out.println("Data inserted Successfully");
				break;
				
				//Update Employee Details
				
			case 2:
				EmployeeDao.updateEmployeeData();
				//Delete Employee Details
				
			case 3:
				System.out.println("Enter Id which you want delete");
				int id = s.nextInt();
				EmployeeDao.deleteEmployeeData(id);
				System.out.println("Id is deleted");
				break;
				
				//Show Employee Details
				
			case 4:
				EmployeeDao.showAllStudentData();
				break;
				
				// Exit
				
			case 5:
				System.out.println("See You Soon");
				break;
			default:
				System.out.println("Wrong Choice");
		}

	}
		while(ch!=5);

}
}
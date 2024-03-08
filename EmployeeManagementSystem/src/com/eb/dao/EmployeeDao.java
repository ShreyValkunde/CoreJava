package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.eb.database.CP;

import com.eb.pojo.Employee;

public class EmployeeDao {
	public static boolean insertEmployeeData(Employee e)
	{
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			String query = "insert into employee (name,desgination,phoneNo,address,salary)values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, e.getEmployeeName());
			ps.setString(2,e.getEmployeeDesgination());
			ps.setString(3, e.getEmployeePhoneNo());
			ps.setString(4, e.getEmployeeAddress());
			ps.setInt(5, e.getEmployeeSalary());
			ps.executeUpdate();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return false;
	}
	public static boolean updateEmployeeData()
	{
		
		try
		{
			boolean f = false;
			Connection conn = CP.createc();
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter Employee Id which you want to Update");
			int id = s.nextInt();
			
			System.out.println("Enter Employee Name which you want to Update");
			String name = s.next();
			
			System.out.println("Enter Employee desgination which you want to Update");
			String desgination = s.next();
			
			System.out.println("Enter Employee PhoneNo which you want to Update");
			String phone = s.next();
			
			System.out.println("Enter Employee Address which you want to Update");
			String address = s.next();
			
			System.out.println("Enter Employee Salary which you want to Update");
			String salary = s.next();
			
			String query = "update employee set name= '"+name+"',desgination= '"+desgination+"',phoneNo ='"+phone+"',address='"+address+"',salary='"+salary+"'  where id ="+id;
			PreparedStatement ps = conn.prepareStatement(query);
			ps.executeUpdate();
			f = true;
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return false;
	}
	public static boolean deleteEmployeeData(int EmployeeId)
	{
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			String query="delete from employee where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,EmployeeId );
			ps.executeUpdate();
			f = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public static void showAllStudentData()
	{
		boolean f = false;
		try
		{
			Connection conn = CP.createc();
			String query = "select * from employee";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String designation = rs.getString(3);
				String phoneNo = rs.getNString(4);
				String address = rs.getNString(5);
				int salary = rs.getInt(6);
				
				System.out.println("Employee Id:"+id+"/n Employee Name:"+name+"/n Employee Desgination:"+designation+"/n Emolyee Phoneno"+phoneNo+"/n Employee Address:"+address+"/n Employee Salary:"+salary);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

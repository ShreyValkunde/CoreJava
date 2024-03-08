package com.eb.pojo;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private String EmployeeDesgination;
	private String EmployeePhoneNo;
	private String EmployeeAddress;
	private int EmployeeSalary;
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeDesgination() {
		return EmployeeDesgination;
	}
	public void setEmployeeDesgination(String employeeDesgination) {
		EmployeeDesgination = employeeDesgination;
	}
	public String getEmployeePhoneNo() {
		return EmployeePhoneNo;
	}
	public void setEmployeePhoneNo(String employeePhoneNo) {
		EmployeePhoneNo = employeePhoneNo;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
	public int getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, String employeeDesgination, String employeePhoneNo, String employeeAddress,
			int employeeSalary) {
		super();
		EmployeeName = employeeName;
		EmployeeDesgination = employeeDesgination;
		EmployeePhoneNo = employeePhoneNo;
		EmployeeAddress = employeeAddress;
		EmployeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeDesgination="
				+ EmployeeDesgination + ", EmployeePhoneNo=" + EmployeePhoneNo + ", EmployeeAddress=" + EmployeeAddress
				+ ", EmployeeSalary=" + EmployeeSalary + "]";
	}
	
}

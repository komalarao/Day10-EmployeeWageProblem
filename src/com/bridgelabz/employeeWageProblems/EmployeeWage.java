package com.bridgelabz.employeeWageProblems;

public class EmployeeWage {
	
	 public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Problem");
	        //Check Employee Attendance
	        double Emp_Check = Math.floor(Math.random()*10) % 2;
	        if (Emp_Check == 1)
	            System.out.println("Employee is Present");
	        else
	            System.out.println("Employee is Absent");
	    }
}

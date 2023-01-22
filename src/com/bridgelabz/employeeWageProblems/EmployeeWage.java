package com.bridgelabz.employeeWageProblems;

public class EmployeeWage {
	
	public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        double Emp_Check = Math.floor(Math.random()*10) % 2;
        int Working_Hours = 0;
        int Daily_Wage = 0;
        int EmpRate_PerHr = 20;
        int isFullTime = 0;
        int isPartTime = 0;
        int Monthly_Wage = 0;
        int Working_Days = 20;
        //Solving using switch case
        switch ((int)(Emp_Check)) {

            case 1 :
                isFullTime = 1;
                Working_Hours = 8;
                System.out.println("Employee is working Full Time");
                System.out.println("Working hours of Employee are : " + Working_Hours);
                break;

            case 0 :
                isPartTime = 0;
                Working_Hours = 8;
                System.out.println("Employee is working Part Time");
                System.out.println("Working hours of Employee are : " + Working_Hours);
                break;
            default :
            	Working_Hours = 0;
                break;
        }
        //Calculating Wages for a Month
        Daily_Wage = Working_Hours * EmpRate_PerHr;
        Monthly_Wage = Daily_Wage * Working_Days;

        System.out.println("Daily Wage of Employee is : $" + Daily_Wage);
        System.out.println("Monthly Wage of Employee is : $" + Monthly_Wage);
    }
}

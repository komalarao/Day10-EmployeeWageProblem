package com.bridgelabz.employeeWageProblems;

public class EmployeeWage {
	
	public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        double Emp_Check = 0.0;
        int Working_Hours = 0;
        int Daily_Wage = 0;
        int EmpRate_PerHr = 20;
        int isFullTime = 0;
        int isPartTime = 0;
        int Monthly_Wage = 0;
        int Working_Days = 20;
        int days = 0;
        int Total_Working_Hours = 0;
        int Max_Hours = 100;
        int Max_Days = 20;
        int wage = 0;
        int Total_Wage = 0;
        System.out.println("Welcome to Employee Wage Computation Program!");

        //Calculate Wages till a condition of total working hours or days is reached for a month
        while (days < Max_Days && Total_Working_Hours < Max_Hours) {

        	Emp_Check = Math.floor(Math.random()*10) % 3;
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

                case 2 :
                	Working_Hours = 0;
                    System.out.println("Employee is Absent");
                    System.out.println("Working hours of Employee are : " + Working_Hours);
                    break;

                default :
                	Working_Hours = 0;
                    break;

            }

            Total_Working_Hours = Total_Working_Hours + Working_Hours;

            if (Total_Working_Hours > Max_Hours) {
            	Total_Working_Hours = Total_Working_Hours - Working_Hours;
            }

            wage = Working_Hours * EmpRate_PerHr;
            Total_Wage = Total_Wage + wage;
            days++;

        }

        System.out.println();
        System.out.println("Total number of Days worked : " + days);
        System.out.println("Total number of Hours worked : " + Total_Working_Hours);
        System.out.println("Total Wage of Employee for the month : $" + Total_Wage);

    }

}

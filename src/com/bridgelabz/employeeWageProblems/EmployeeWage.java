package com.bridgelabz.employeeWageProblems;

public class EmployeeWage {
	
	public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static void main(String args[]) {
        computeEmpWage("Google", 50, 15, 200);
        computeEmpWage("Amazon", 80, 20, 120);
        computeEmpWage("Meta", 60, 20, 100);
        computeEmpWage("Netflix", 90, 18, 220);
        computeEmpWage("Tesla", 100, 20, 250);
    }

    public static void computeEmpWage(String Company_Name, int EmpRate_PerHour, int NumOf_Working_Days, int Max_Hours_In_Month) {
        int Emp_Hrs = 0;
        int Emp_Wage = 0;
        int Total_EmpWage = 0;
        int Total_Working_Days = 0;
        int Total_EmpHrs = 0;

        for (Total_Working_Days = 1; Total_EmpHrs <= Max_Hours_In_Month && Total_Working_Days < NumOf_Working_Days; Total_Working_Days++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME :
                	Emp_Hrs = 8;
                    System.out.println("Employee is present Full time.");
                    break;

                case IS_PART_TIME :
                	Emp_Hrs = 4;
                    System.out.println("Employee is present Part time.");
                    break;

                default :
                	Emp_Hrs = 0;
                    System.out.println("Employee is absent.");
            }
            Emp_Wage = Emp_Hrs * EmpRate_PerHour;
            Total_EmpHrs += Emp_Hrs;
            //totalEmpWage += empWage;
            System.out.println("Day " + Total_Working_Days + "	Employee hours : " + Emp_Hrs +"	Wage $" + Emp_Wage);
        }
        Total_EmpWage = Total_EmpHrs * EmpRate_PerHour;
        System.out.println();
        System.out.println(Company_Name+" company Employee Monthly Wage : $" + Total_EmpWage+"\n\n");
    }
}

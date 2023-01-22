package com.bridgelabz.employeeWageProblems;

public class EmployeeWage {
	
	public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String companyName;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursInMonth;
    private int totalEmpWage;

    public EmployeeWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursInMonth = maxHoursInMonth;
    }

    public static void main(String args[]) {
        EmployeeWage google = new EmployeeWage("Google", 50, 15, 200);
        EmployeeWage amazon = new EmployeeWage("Amazon", 80, 20, 120);
        EmployeeWage netflix = new EmployeeWage("Netflix", 90, 18, 220);

        google.computeEmpWage();
        System.out.println(google);
        amazon.computeEmpWage();
        System.out.println(amazon);
        netflix.computeEmpWage();
        System.out.println(netflix);
    }

    public void computeEmpWage() {
        int Emp_Hrs = 0;
        int Emp_Wage = 0;
        int Total_Working_Days = 0;
        int Total_EmpHrs = 0;

        for (Total_Working_Days = 1; Total_EmpHrs <= maxHoursInMonth && Total_Working_Days < numOfWorkingDays; Total_Working_Days++) {
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
            Emp_Wage = Emp_Hrs * empRatePerHour;
            Total_EmpHrs += Emp_Hrs;
            //totalEmpWage += empWage;
            System.out.println("Day " + Total_Working_Days + "	Employee hours : " + Emp_Hrs +"	Wage $" + Emp_Wage);
        }
        totalEmpWage = Total_EmpHrs * empRatePerHour;
        System.out.println();
    }

    @Override
    public String toString() {
        return " "+companyName+" company Employee Monthly Wage : $" + totalEmpWage+"\n\n";
    }
}

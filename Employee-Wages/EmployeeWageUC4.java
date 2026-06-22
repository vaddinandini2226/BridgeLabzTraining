package employee;

public class EmployeeWageUC4 {

	    static final int IS_PART_TIME = 1;
	    static final int IS_FULL_TIME = 2;
	    static final int EMP_RATE_PER_HOUR = 20;
	    static final int NUM_OF_WORKING_DAYS = 20;

	    public static void main(String[] args) {

	        int totalEmpWage = 0;

	        for (int day = 1; day <= NUM_OF_WORKING_DAYS; day++) {

	            int empHours = 0;
	            int empCheck = (int) (Math.random() * 3);

	            switch (empCheck) {

	                case IS_PART_TIME:
	                    empHours = 4;
	                    System.out.println("Day " + day + ": Part Time");
	                    break;

	                case IS_FULL_TIME:
	                    empHours = 8;
	                    System.out.println("Day " + day + ": Full Time");
	                    break;

	                default:
	                    empHours = 0;
	                    System.out.println("Day " + day + ": Absent");
	            }

	            int dailyWage = empHours * EMP_RATE_PER_HOUR;
	            totalEmpWage += dailyWage;

	            System.out.println("Daily Wage = ₹" + dailyWage);
	        }

	        System.out.println("\nTotal Monthly Wage = ₹" + totalEmpWage);
	    }
	
}

package employee;

public class EmployeeUC5 {
	    static final int IS_PART_TIME = 1;
	    static final int IS_FULL_TIME = 2;

	    static final int EMP_RATE_PER_HOUR = 20;
	    static final int MAX_HOURS_IN_MONTH = 100;
	    static final int MAX_WORKING_DAYS = 20;

	    public static void main(String[] args) {

	        int totalEmpHours = 0;
	        int totalWorkingDays = 0;

	        while (totalEmpHours < MAX_HOURS_IN_MONTH &&
	               totalWorkingDays < MAX_WORKING_DAYS) {

	            totalWorkingDays++;

	            int empHours = 0;
	            int empCheck = (int) (Math.random() * 3);

	            switch (empCheck) {

	                case IS_PART_TIME:
	                    empHours = 4;
	                    System.out.println("Day " + totalWorkingDays + ": Part Time");
	                    break;

	                case IS_FULL_TIME:
	                    empHours = 8;
	                    System.out.println("Day " + totalWorkingDays + ": Full Time");
	                    break;

	                default:
	                    empHours = 0;
	                    System.out.println("Day " + totalWorkingDays + ": Absent");
	            }

	            totalEmpHours += empHours;
	        }

	        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;

	        System.out.println("\nTotal Working Days = " + totalWorkingDays);
	        System.out.println("Total Working Hours = " + totalEmpHours);
	        System.out.println("Total Monthly Wage = ₹" + totalEmpWage);
	    }
	
}

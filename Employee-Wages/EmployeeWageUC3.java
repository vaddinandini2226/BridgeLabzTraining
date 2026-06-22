package employee;

public class EmployeeWageUC3 {

	    static final int IS_ABSENT = 0;
	    static final int IS_PART_TIME = 1;
	    static final int IS_FULL_TIME = 2;

	    static final int EMP_RATE_PER_HOUR = 20;

	    public static void main(String[] args) {

	        // Generate random value: 0, 1, or 2
	        int empCheck = (int) (Math.random() * 3);

	        int empHours = 0;

	        switch (empCheck) {

	            case IS_PART_TIME:
	                empHours = 8;
	                System.out.println("Employee is Part Time");
	                break;

	            case IS_FULL_TIME:
	                empHours = 16;
	                System.out.println("Employee is Full Time");
	                break;

	            default:
	                empHours = 0;
	                System.out.println("Employee is Absent");
	        }

	        int empWage = empHours * EMP_RATE_PER_HOUR;

	        System.out.println("Employee Hours = " + empHours);
	        System.out.println("Daily Employee Wage = ₹" + empWage);
	    
	}
}

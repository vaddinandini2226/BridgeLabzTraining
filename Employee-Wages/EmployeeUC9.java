package employee;
import java.util.Random;

public class EmployeeUC9 {




	    // Instance Variables
	    private String companyName;
	    private int empRatePerHour;
	    private int maxWorkingDays;
	    private int maxWorkingHours;
	    private int totalEmpWage;

	    // Constants
	    private static final int IS_PART_TIME = 1;
	    private static final int IS_FULL_TIME = 2;
	    private static final int PART_TIME_HOURS = 4;
	    private static final int FULL_TIME_HOURS = 8;

	    // Constructor
	    public EmployeeUC9(String companyName, int empRatePerHour,
	                          int maxWorkingDays, int maxWorkingHours) {

	        this.companyName = companyName;
	        this.empRatePerHour = empRatePerHour;
	        this.maxWorkingDays = maxWorkingDays;
	        this.maxWorkingHours = maxWorkingHours;
	    }

	    // Method For calculating  Employee Wage
	    public void computeEmpWage() {

	        int totalWorkingDays = 0;
	        int totalEmpHours = 0;

	        Random random = new Random();

	        while (totalWorkingDays < maxWorkingDays &&
	               totalEmpHours < maxWorkingHours) {

	            totalWorkingDays++;

	            int empCheck = random.nextInt(3);
	            int empHours = 0;

	            switch (empCheck) {
	                case IS_PART_TIME:
	                    empHours = PART_TIME_HOURS;
	                    break;

	                case IS_FULL_TIME:
	                    empHours = FULL_TIME_HOURS;
	                    break;

	                default:
	                    empHours = 0;
	            }

	            if (totalEmpHours + empHours > maxWorkingHours) {
	                empHours = maxWorkingHours - totalEmpHours;
	            }

	            totalEmpHours += empHours;
	        }

	        totalEmpWage = totalEmpHours * empRatePerHour;
	    }

	    // Display wage of the employee
	    public void displayWage() {
	        System.out.println("Company Name      : " + companyName);
	        System.out.println("Total Employee Wage : " + totalEmpWage);
	        System.out.println();
	    }
	    public static void main(String[] args) {

	        EmployeeUC9 tcs = new EmployeeUC9("tcs", 20, 20, 100);
	        EmployeeUC9 infosys = new EmployeeUC9("infosys", 25, 22, 120);

	        tcs.computeEmpWage();
	        infosys.computeEmpWage();

	        tcs.displayWage();
	        infosys.displayWage();
	    }
	
}

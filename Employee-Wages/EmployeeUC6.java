package employee;

import java.util.Random;
public class EmployeeUC6 {

	static final int EMP_RATE_PER_HOUR = 20;
	static final int FULL_TIME_HOURS = 8;
	static final int PART_TIME_HOURS = 4;
	static final int MAX_WORKING_DAYS = 20;
	static final int MAX_WORKING_HOURS = 100;

	public static void main(String[] args) {

		int totalEmpHours = 0;
		int totalWorkingDays = 0;
		int totalSalary = 0;

		Random random = new Random();

		while (totalEmpHours < MAX_WORKING_HOURS &&
				totalWorkingDays < MAX_WORKING_DAYS) {

			totalWorkingDays++;

			int empCheck = random.nextInt(3);
			int empHours = 0;

			switch (empCheck) {

			case 1:
				empHours = FULL_TIME_HOURS;
				break;

			case 2:
				empHours = PART_TIME_HOURS;
				break;

			default:
				empHours = 0;
			}

			// Prevent exceeding 100 hours
			if (totalEmpHours + empHours > MAX_WORKING_HOURS) {
				empHours = MAX_WORKING_HOURS - totalEmpHours;
			}

			totalEmpHours += empHours;

			int dailyWage = empHours * EMP_RATE_PER_HOUR;
			totalSalary += dailyWage;

			System.out.println("Day " + totalWorkingDays);
			System.out.println("Employee Hours : " + empHours);
			System.out.println("Daily Wage     : " + dailyWage);
			System.out.println("----------------------------");
		}

		System.out.println("\n===== Final Result =====");
		System.out.println("Total Working Days : " + totalWorkingDays);
		System.out.println("Total Working Hours: " + totalEmpHours);
		System.out.println("Total Salary       : " + totalSalary);
	}
}

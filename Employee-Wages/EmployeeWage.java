package employee;

public class EmployeeWage {

    static final int IS_PRESENT = 1;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int EMP_HOURS = 8;

    public static void main(String[] args) {

        // Generate random attendance (0 or 1)
        int attendance = (int) (Math.random() * 2);

        int dailyWage = 0;

        if (attendance == IS_PRESENT) {
            dailyWage = EMP_RATE_PER_HOUR * EMP_HOURS;
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

        System.out.println("Daily Employee Wage = ₹" + dailyWage);
    }
}

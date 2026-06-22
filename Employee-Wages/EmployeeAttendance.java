package employee;

public class EmployeeAttendance {
    public static void main(String[] args) {

        // Generate random number: 0 or 1
        int attendance = (int) (Math.random() * 2);

        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

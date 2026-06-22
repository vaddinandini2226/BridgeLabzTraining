package basicsPgms;

import java.util.Scanner;

public class LeapYear1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit year: ");
        int year = sc.nextInt();

        // Check if the year is a 4-digit number
        if (year < 1000 || year > 9999) {
            System.out.println("Invalid input! Please enter a 4-digit year.");
        } else {

            // Leap year logic
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}

package employee;

import java.util.Scanner;

public class LineComparision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Line 1
        System.out.println("Enter coordinates of Line 1:");
        System.out.print("x1: ");
        int x1 = sc.nextInt();
        System.out.print("y1: ");
        int y1 = sc.nextInt();
        System.out.print("x2: ");
        int x2 = sc.nextInt();
        System.out.print("y2: ");
        int y2 = sc.nextInt();

        // Line 2
        System.out.println("\nEnter coordinates of Line 2:");
        System.out.print("x3: ");
        int x3 = sc.nextInt();
        System.out.print("y3: ");
        int y3 = sc.nextInt();
        System.out.print("x4: ");
        int x4 = sc.nextInt();
        System.out.print("y4: ");
        int y4 = sc.nextInt();

        // Calculate lengths
        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        System.out.println("\nLength of Line 1 = " + length1);
        System.out.println("Length of Line 2 = " + length2);

        // Check equality using equals()
        if (length1.equals(length2)) {
            System.out.println("Both lines are Equal.");
        } else {
            System.out.println("Both lines are Not Equal.");
        }

        sc.close();
    }
}
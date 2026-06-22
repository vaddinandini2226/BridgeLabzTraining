package basicsPgms;

import java.util.Scanner;

public class HarmonicNumber {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        // Validate input
        if (n == 0) {
            System.out.println("N should not be 0.");
            return;
        }

        double harmonic = 0.0;

        // Calculate harmonic value
        for (int i = 1; i <= n; i++) {
            harmonic = harmonic + (1.0 / i);
        }

        System.out.println("The " + n + "th Harmonic Number is: " + harmonic);

        sc.close();
    }
}
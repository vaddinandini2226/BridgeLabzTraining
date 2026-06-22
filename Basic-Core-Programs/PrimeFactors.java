package basicsPgms;

import java.util.Scanner;

public class PrimeFactors {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return;
        }

        System.out.print("Prime Factors of " + n + " are: ");

        // Find prime factors
        for (int i = 2; i * i <= n; i++) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If n is still greater than 1, then it is a prime number
        if (n > 1) {
            System.out.print(n);
        }

        sc.close();
    }
}
package basicsPgms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of times to flip the coin: ");
        int n = sc.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0;
        int tails = 0;

        // Flip the coin n times
        for (int i = 1; i <= n; i++) {

            double flip = random.nextDouble(); // Generates a value between 0.0 and 1.0

            if (flip < 0.5) {
                tails++;
                System.out.println("Flip " + i + ": Tails");
            } else {
                heads++;
                System.out.println("Flip " + i + ": Heads");
            }
        }

        // Calculate percentages
        double headPercentage = (heads * 100.0) / n;
        double tailPercentage = (tails * 100.0) / n;

        // Display results
        System.out.println("\n----- Result -----");
        System.out.println("Total Flips : " + n);
        System.out.println("Heads Count : " + heads);
        System.out.println("Tails Count : " + tails);
        System.out.printf("Heads Percentage : %.2f%%\n", headPercentage);
        System.out.printf("Tails Percentage : %.2f%%\n", tailPercentage);

        sc.close();
    }
}
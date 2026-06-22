package snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC2
    {

    public static void main(String[] args) {

        Random random = new Random();

        int position = 0;

        while (position < 100) {

            // Roll the dice
            int dice = random.nextInt(6) + 1;

            // Generate option
            int option = random.nextInt(3);

            System.out.println("\nDice: " + dice);

            switch (option) {

                case 0:
                    System.out.println("No Play");
                    break;

                case 1:
                    System.out.println("Ladder");
                    position = position + dice;
                    break;

                case 2:
                    System.out.println("Snake");
                    position = position - dice;

                    // If position goes below 0, restart from 0
                    if (position < 0) {
                        position = 0;
                    }
                    break;
            }

            System.out.println("Current Position: " + position);
        }

        System.out.println("\nPlayer Wins! Reached Position 100");
    }
}

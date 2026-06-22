package snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC4 {

    public static void main(String[] args) {

        Random random = new Random();

        int position = 0;
        int diceCount = 0;

        System.out.println("Snake and Ladder Game Started");
        System.out.println("Initial Position: " + position);

        while (position != 100) {

            // Count each dice roll
            diceCount++;

            // Roll the dice (1 to 6)
            int dice = random.nextInt(6) + 1;

            // Generate option
            // 0 = No Play
            // 1 = Ladder
            // 2 = Snake
            int option = random.nextInt(3);

            System.out.println("\nDice Roll " + diceCount);
            System.out.println("Dice Value : " + dice);

            switch (option) {

                case 0:
                    System.out.println("Option : No Play");
                    break;

                case 1:
                    System.out.println("Option : Ladder");

                    if (position + dice <= 100) {
                        position += dice;
                    } else {
                        System.out.println("Move exceeds 100. Stay at same position.");
                    }
                    break;

                case 2:
                    System.out.println("Option : Snake");

                    position -= dice;

                    if (position < 0) {
                        position = 0;
                    }
                    break;
            }

            // Display position after every dice roll
            System.out.println("Current Position : " + position);
        }

        System.out.println("\n===============================");
        System.out.println("Player Wins!");
        System.out.println("Final Position : " + position);
        System.out.println("Total Dice Rolls : " + diceCount);
        System.out.println("===============================");
    }
}

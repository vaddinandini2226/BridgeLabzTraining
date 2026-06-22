package snakeandladder;

import java.util.Random;

public class SnakeAndLadderGame {
    public static void main(String[] args) {

        Random random = new Random();

        int position = 0;

        // Roll the die (1 to 6)
        int dice = random.nextInt(6) + 1;
        System.out.println("Dice rolled: " + dice);

        // Generate option (0 = No Play, 1 = Ladder, 2 = Snake)
        int option = random.nextInt(3);

        switch (option) {
            case 0:
                System.out.println("No Play");
                // Position remains the same
                break;

            case 1:
                System.out.println("Ladder");
                position = position + dice;
                break;

            case 2:
                System.out.println("Snake");
                position = position - dice;

                // Position should not become negative
                if (position < 0) {
                    position = 0;
                }
                break;
        }

        System.out.println("Player Position: " + position);
    }
}

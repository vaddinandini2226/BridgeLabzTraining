package snakeandladder;

import java.util.Random;

public class SnakeAndLadderUC5 {

    public static void main(String[] args) {

        Random random = new Random();

        int player1Position = 0;
        int player2Position = 0;

        int currentPlayer = 1;
        int diceCount = 0;

        while (player1Position != 100 && player2Position != 100) {

            diceCount++;

            int dice = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            System.out.println("--------------------------------");
            System.out.println("Player " + currentPlayer);
            System.out.println("Dice : " + dice);

            if (currentPlayer == 1) {

                switch (option) {

                    case 0:
                        System.out.println("Option : No Play");
                        currentPlayer = 2;
                        break;

                    case 1:
                        System.out.println("Option : Ladder");

                        if (player1Position + dice <= 100) {
                            player1Position += dice;
                        }

                        // Same player gets another chance
                        break;

                    case 2:
                        System.out.println("Option : Snake");

                        player1Position -= dice;

                        if (player1Position < 0)
                            player1Position = 0;

                        currentPlayer = 2;
                        break;
                }

            } else {

                switch (option) {

                    case 0:
                        System.out.println("Option : No Play");
                        currentPlayer = 1;
                        break;

                    case 1:
                        System.out.println("Option : Ladder");

                        if (player2Position + dice <= 100) {
                            player2Position += dice;
                        }

                        // Same player gets another chance
                        break;

                    case 2:
                        System.out.println("Option : Snake");

                        player2Position -= dice;

                        if (player2Position < 0)
                            player2Position = 0;

                        currentPlayer = 1;
                        break;
                }

            }

            System.out.println("Player 1 Position : " + player1Position);
            System.out.println("Player 2 Position : " + player2Position);
        }

        System.out.println("\n==============================");

        if (player1Position == 100)
            System.out.println("🎉 Player 1 Wins!");

        else
            System.out.println("🎉 Player 2 Wins!");

        System.out.println("Total Dice Rolls : " + diceCount);

        System.out.println("==============================");
    }
}

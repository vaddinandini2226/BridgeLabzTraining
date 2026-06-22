package snakeandladder;

public class SnakeAndLadderUC1 {

    public static void main(String[] args) {

        // Player starts at position 0
        int position = 0;

        // Roll the dice (1 to 6)
        int dice = (int) (Math.floor(Math.random() * 6) + 1);

        System.out.println("Player starts at position: " + position);
        System.out.println("Dice rolled: " + dice);
    }
}

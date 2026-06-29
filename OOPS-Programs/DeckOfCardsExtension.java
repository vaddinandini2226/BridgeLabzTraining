package oopsprograms;

/*
 * Program: Deck of Cards using Queue
 *
 * This program creates and shuffles a deck of 52 cards, distributes
 * 9 cards to each of 4 players, sorts the cards by rank, and stores
 * them in a Queue implemented using a Linked List (without using the
 * Collection Framework). The players are also maintained in a Queue,
 * and the cards of each player are displayed.
 */

import java.util.Random;

public class DeckOfCardsExtension {

  public static void main(String[] args) {

      String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

      String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
              "Jack", "Queen", "King", "Ace"};

      String[] deck = new String[52];

      int index = 0;

      for (int i = 0; i < suits.length; i++) {

          for (int j = 0; j < ranks.length; j++) {

              deck[index] = ranks[j] + " of " + suits[i];
              index++;
          }
      }

      Random random = new Random();

      for (int i = 0; i < deck.length; i++) {

          int randomIndex = random.nextInt(52);

          String temp = deck[i];
          deck[i] = deck[randomIndex];
          deck[randomIndex] = temp;
      }

      // Distribute 9 cards to 4 players using 2D array
      String[][] players = new String[4][9];

      index = 0;

      for (int i = 0; i < 4; i++) {

          for (int j = 0; j < 9; j++) {

              players[i][j] = deck[index];
              index++;
          }
      }

      for (int i = 0; i < 4; i++) {

          System.out.println("\nPlayer " + (i + 1) + " Cards:");

          for (int j = 0; j < 9; j++) {

              System.out.println(players[i][j]);
          }
      }
  }
}

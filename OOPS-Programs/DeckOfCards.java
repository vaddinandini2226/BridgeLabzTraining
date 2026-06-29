package oopsprograms;

/*
 * Program: Deck of Cards
 * 
 * This program creates a standard deck of 52 playing cards using
 * four suits and thirteen ranks. The deck is shuffled randomly,
 * and 9 cards are distributed to each of 4 players using a 2D array.
 * Finally, the cards received by each player are displayed.
 */

import java.util.Random;
class PlayerNode {

    Player player;
    PlayerNode next;

    PlayerNode(Player player) {
        this.player = player;
        this.next = null;
    }
}

//created a linked list node
class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

//created queue that stored the cards.
class Queue {
    Node front;
    Node rear;

    //enqueue method to add card into the queue
    public void enqueue(String card) {

        Node newNode = new Node(card);

        if (front == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public void display() {

        Node temp = front;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class PlayerQueue {

    PlayerNode front;
    PlayerNode rear;

    //creating player and adding it to the playerQueue
    public void enqueue(Player player) {

        PlayerNode newNode = new PlayerNode(player);

        if(front == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public void displayPlayers() {

        PlayerNode temp = front;

        while(temp != null){

            System.out.println(temp.player.name);

            temp.player.cards.display();

            System.out.println("----------------------");

            temp = temp.next;
        }
    }
}

//player class to store player minute details as player name and cards of each player.
class Player {

    String name;
    Queue cards;

    Player(String name) {
        this.name = name;
        cards = new Queue();
    }
}


//main class of handling the functionality.
public class DeckOfCards {

    static String[] suits = {
            "Clubs",
            "Diamonds",
            "Hearts",
            "Spades"
    };

    static String[] ranks = {
            "2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"
    };

    public static void main(String[] args) {

        String[] deck = new String[52];

        int index = 0;

        // Create Deck
        for(int i=0;i<suits.length;i++) {

            for(int j=0;j<ranks.length;j++) {

                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }

        // Shuffle Deck
        Random random = new Random();

        for(int i=0;i<deck.length;i++) {

            int randomIndex = random.nextInt(52);

            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Create Players
        PlayerQueue playerQueue = new PlayerQueue();

        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        Player p3 = new Player("Player 3");
        Player p4 = new Player("Player 4");

        playerQueue.enqueue(p1);
        playerQueue.enqueue(p2);
        playerQueue.enqueue(p3);
        playerQueue.enqueue(p4);

        Player[] players = {p1, p2, p3, p4};

        index = 0;

        // Distribute 9 cards
        for(int i=0;i<4;i++) {

            String[] cards = new String[9];

            for(int j=0;j<9;j++) {

                cards[j] = deck[index++];
            }

            sortCards(cards);

            for(int j=0;j<9;j++) {

                players[i].cards.enqueue(cards[j]);
            }
        }

        // Display Players
        playerQueue.displayPlayers();
    }

    // Bubble Sort according to Rank
    public static void sortCards(String[] cards) {

        for(int i=0;i<cards.length-1;i++) {

            for(int j=i+1;j<cards.length;j++) {

                if(getRank(cards[i]) > getRank(cards[j])) {

                    String temp = cards[i];
                    cards[i] = cards[j];
                    cards[j] = temp;
                }
            }
        }
    }

    // Returns rank value
    public static int getRank(String card) {

        String rank = card.split(" ")[0];

        switch(rank) {

            case "2":
                return 2;

            case "3":
                return 3;

            case "4":
                return 4;

            case "5":
                return 5;

            case "6":
                return 6;

            case "7":
                return 7;

            case "8":
                return 8;

            case "9":
                return 9;

            case "10":
                return 10;

            case "Jack":
                return 11;

            case "Queen":
                return 12;

            case "King":
                return 13;

            case "Ace":
                return 14;
        }

        return 0;
    }
}

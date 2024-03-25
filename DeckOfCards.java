public class DeckOfCards {

    public static void main(String[] args) {
    
    // 1. Define and Initialise our deck of cards
    int[] deck = new int[52];
    
    // 2. An array of strings which stores suits
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    
    // 3. Array of ranks
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
    "10", "Jack", "Queen", "King"};
    
    // 4. Initialise the cards
    for(int i=0; i<deck.length; i++) {
    deck[i] = i;
    }
    
    // 5. Shuffle the cards
    
    for(int i=0; i<deck.length; i++) {
    int j = (int)(Math.random() * deck.length);
    int temp = deck[i];
    deck[i] = deck[j];
    deck[j] = temp;
    }
    
    // 6. Display the first 4 cards
    for(int i=0; i<4; i++) {
    String suit = suits[deck[i] / 13]; // suit
    String rank = ranks[deck[i] % 13];
    
    System.out.println("Card number " + deck[i] + " : " + rank + " of " + suit);
    }
    
    }
    
    }
import java.util.ArrayList;

public class Deck {
    private ArrayList cards;

    public Deck() {
        cards = new ArrayList<Card>();
        generateDeck();
    }

    // Generate Deck
    public void generateDeck() {
        for (Value value : Card.Value) {
            for (Suit suit : Card.Suit) {
                Card newCard = new Card(value, suit);
                cards.add(newCard);
            }
        }
    }

    // Shuffle
    public void shuffleDeck() {
        
    }

    // Draw card
    public String drawCard() {
        if (cards.size() > 0) {
            return cards.remove(cards.size()).toString();
        } else {
            return "There are no cards in the deck";
        }
    }
}
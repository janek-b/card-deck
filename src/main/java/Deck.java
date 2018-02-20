import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<Card>();

    public Deck() {
        generateDeck();
    }

    // Generate Deck
    public void generateDeck() {
        cards.clear();
        for (Card.Value value : Card.Value.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                Card newCard = new Card(value, suit);
                cards.add(newCard);
            }
        }
    }

    // Shuffle
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    // This returns a string representation to avoid exception handling for the sake of simplicity
    public String drawCard(){
        if (cards.size() > 0) {
            return cards.remove(cards.size() - 1).toString();
        } else {
            return "There are no cards in the deck";
        }
    }
}
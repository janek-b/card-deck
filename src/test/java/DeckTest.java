import org.junit.*;
import static org.junit.Assert.*;

import java.beans.Transient;

public class DeckTest {

    @Test
    public void deck_instantiates_correctly() {
        Deck deck = new Deck();
        assertTrue(deck instanceof Deck);
    }

    @Test
    public void deck_drawCard_returns_card() {
        Deck deck = new Deck();
        String card = deck.drawCard();
        assertFalse(card.equals("There are no cards in the deck"));
    }

}
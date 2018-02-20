public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.drawCard());
        }
        
    }
}
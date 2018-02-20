import java.io.Console;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();

        Console console = System.console();
        boolean running = true;

        System.out.println("Type S to shuffle the deck");
        System.out.println("Type D to draw a card from the deck");
        System.out.println("Type E to exit");

        while (running) {
            String userInput = console.readLine();

            if (userInput.equals("S")) {
                deck.shuffleDeck();
            }

            if (userInput.equals("D")) {
                System.out.println(deck.drawCard());
            }

            if (userInput.equals("E")) {
                running = false;
            }
            
        }
        
    }
}
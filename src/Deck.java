import java.util.Random;


public class Deck {

    private Card[] deck;
    private int currentCard; //index of next card to be dealt

    public Deck() {

        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};

        deck = new Card[52];
        currentCard = 0;

        /**
         * Building the deck
         */
        int suitCounter = 0;
        while (suitCounter < 4) {
            int faceNum = 0;
            while (faceNum < 13) {
                deck[(faceNum + (suitCounter * 13))] = new Card (
                        suits[suitCounter],
                        faces[faceNum],
                        faceNum+2);

                faceNum++;
            }
            suitCounter++;
        }
    }

    /**
     * Printing the deck
     */
    public void displayDeck() {

        for (Card card : deck)
            System.out.println(card);

    }

    public void shuffle() {

        Random mrRandom = new Random();
        int currentCard = 0;
        int first = 0;
        while (currentCard < deck.length) {
            int second = mrRandom.nextInt(52);
            currentCard++;
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
            first++;
        }

    }

    public static void main(String[] args) {

        Deck theDeck = new Deck();
        theDeck.displayDeck();
        theDeck.shuffle();
        theDeck.displayDeck();
    }

}

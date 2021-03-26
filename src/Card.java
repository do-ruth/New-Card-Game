public class Card {

    private String faceName, suit;
    private int faceValue;

    /**
     * Constructor for card class (learned how to do this on youtube)
     * @param suit "spades", "clubs", "diamonds", "hearts"
     * @param face 2, 3, 4, 5, ..., King, Ace
     * @param value 2, 3, 4, 5, ..., 13, 14
     */
    public Card(String suit, String face, int value) {

        this.suit = suit;   //I have two "suit" so this.suit refers to the suit outside
        faceName = face;
        faceValue = value;

    }

    /**
     * This returns the face and suit of the Card object as a string
     * @return
     */
    public String toString() {

        return faceName + " of " + suit;
    }

    /**
     * Returns face value of the Card object as an integer
     * @return
     */
    public int getFaceValue() {

        return faceValue;
    }

    public static void main(String[] args) {

        Card aceOfSpades = new Card("Spades", "Ace", 14);
        Card queenOfHearts = new Card("Hearts", "Queen", 12);

        System.out.println(aceOfSpades.toString());
        System.out.println("Card Value: " + aceOfSpades.getFaceValue());

        System.out.println(queenOfHearts.toString());
        System.out.println("Card Value: " + queenOfHearts.getFaceValue());
    }
}

public class Card {
    private String suit;
    private String rank;
    private int value; // Value for comparing cards

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public String getSuit() { return suit; }
    public String getRank() { return rank; }
    public int getValue() { return value; }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
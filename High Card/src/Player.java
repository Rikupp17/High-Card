public class Player {
    private String name;
    private Card currentCard;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() { return name; }
    public Card getCurrentCard() { return currentCard; }
    public int getScore() { return score; }

    public void drawCard(Deck deck) throws Exception {
        this.currentCard = deck.drawCard();
    }

    public void incrementScore() {
        score++;
    }
}

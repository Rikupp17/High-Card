import java.util.Scanner;

public class Game {
    private  Player player;
    private Player computer;
    private Deck deck;

    public Game() {
        this.player = new Player("Player");
        this.computer = new Player("Computer");
        this.deck = new Deck();
    }

    public void playRound() {
        try {
            player.drawCard(deck);
            computer.drawCard(deck);
            System.out.println(player.getName() + " drew " + player.getCurrentCard());
            System.out.println(computer.getName() + " drew " + computer.getCurrentCard());

            if (player.getCurrentCard().getValue() > computer.getCurrentCard().getValue()) {
                System.out.println(player.getName() + " wins this round!");
                player.incrementScore();
            } else if (player.getCurrentCard().getValue() < computer.getCurrentCard().getValue()) {
                System.out.println(computer.getName() + " wins this round!");
                computer.incrementScore();
            } else {
                System.out.println("It's a tie!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showScores() {
        System.out.println(player.getName() + " Score: " + player.getScore());
        System.out.println(computer.getName() + " Score: " + computer.getScore());
    }

    public void saveScores() {
        GameData.saveScores(player.getScore(), computer.getScore());
    }
}

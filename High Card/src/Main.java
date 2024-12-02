import java.util.Scanner; // Scanner-Klasse importieren

public class Main {
    public static void main(String[] args) {
        Game game = new Game(); // Erstellen des Spiels
        Scanner scanner = new Scanner(System.in); // Scanner für Nutzereingaben
        String playAgain;

        do {
            game.playRound();       // Spielt eine Runde
            game.showScores();      // Zeigt die aktuellen Punktestände
            System.out.print("Play another round? (yes/no): ");
            playAgain = scanner.nextLine(); // Liest die Antwort des Nutzers ein
        } while (playAgain.equalsIgnoreCase("yes"));

        game.saveScores(); // Speichert die Endpunktestände in einer Datei
        System.out.println("Thank you for playing!");
    }
}

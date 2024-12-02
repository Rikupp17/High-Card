import java.io.FileWriter;
import java.io.IOException;

public class GameData {
    public static void saveScores(int playerScore, int computerScore) {
        try (FileWriter writer = new FileWriter("game_scores.txt", true)) {
            writer.write("Player Score: " + playerScore + ", Computer Score: " + computerScore + "\n");
            System.out.println("Scores saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving scores: " + e.getMessage());
        }
    }
}

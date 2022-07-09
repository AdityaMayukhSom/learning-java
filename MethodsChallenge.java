public class MethodsChallenge {
    public static void main(String[] args) {
        displayHighScore("Somoprovo", calculatedHighScorePosition(50));
        displayHighScore("Dipta", calculatedHighScorePosition(1500));
        displayHighScore("Rishav", calculatedHighScorePosition(900));
        displayHighScore("Roheena", calculatedHighScorePosition(400));
    }

    public static void displayHighScore(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculatedHighScorePosition(int score) {
        int playerPosition;
        if (score >= 1000) {
            playerPosition = 1;
        } else if (score >= 500) {
            playerPosition = 2;
        } else if (score >= 100) {
            playerPosition = 3;
        } else {
            playerPosition = 4;
        }

        return playerPosition;
    }
}

public class Methods {
    public static void main(String[] args) {
        System.out.println(calculateScore(8));
    }

    public static String calculateScore(int levelCompleted) {
        String playerDescription;

        if (levelCompleted > 10) {
            playerDescription = "You are a pro player.";
        } else if (levelCompleted > 5) {
            playerDescription = "You are an intermediate player.";
        } else {
            playerDescription = "You are a noob player.";
        }

        return playerDescription;
    }
}

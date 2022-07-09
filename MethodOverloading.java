public class MethodOverloading {
    public static void main(String[] args) {
        // System.out.println(calculateScore());
        // System.out.println(calculateScore(300));
        // System.out.println(calculateScore("Dipta", 500));
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static String calculateScore(String playerName, int score) {
        String myString = playerName + " scored " + score;
        return myString;
    }

    public static String calculateScore(int score) {
        String myString = "Aditya scored " + score;
        return myString;
    }

    public static String calculateScore() {
        String myString = "No player name, No player score.";
        return myString;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double centimeters = (30.48 * feet) + (2.54 * inches);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        int feet = (int) inches / 12;
        inches = inches - (feet * 12);
        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        return centimeters;
    }
}

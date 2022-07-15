import java.util.Scanner;

public class CodingExercise27 {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (scanner.hasNextInt()) {
            sum = sum + scanner.nextInt();
            count++;
        }
        // Math.round(NaN) = 0
        // If the argument is not a number (NaN), this method will return Zero.
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
        scanner.close();
    }
}
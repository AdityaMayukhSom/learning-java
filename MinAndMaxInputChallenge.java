import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an integer: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
            } else {
                break;
            }
        }
        System.out.println("Maximum number entered is " + max);
        System.out.println("Minimum number entered is " + min);

        scanner.close();
    }
}

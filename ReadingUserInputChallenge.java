import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int sum = 0, counter = 1;
        Scanner scanner = new Scanner(System.in);
        while (counter <= 10) {
            System.out.println("Enter number #" + counter);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int value = scanner.nextInt();
                scanner.nextLine();
                sum = sum + value;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("Sum of 10 integers is " + sum);
        scanner.close();
    }
}

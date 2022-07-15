import java.util.Scanner;

public class UserInputs {
    private static final int CURRENT_YEAR = 2022;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            int age = CURRENT_YEAR - birthYear;

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Your name is " + name);
            if (age >= 0 && age <= 100) {
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Enter correct birth year.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }
}

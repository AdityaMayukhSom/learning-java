public class CodingExercise21 {
    public static void main(String[] args) {
        printFactors(10);
        return;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Fallback as the number itself is always a factor to the number
        System.out.println(number);
    }
}

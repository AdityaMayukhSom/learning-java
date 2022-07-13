public class CodingExercise16 {
    // private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstNumber = 0;
        int lastNumber = number % 10;
        int sumFirstAndLast = 0;
        while (number > 0) {
            firstNumber = number % 10;
            number = number / 10;
        }
        sumFirstAndLast = firstNumber + lastNumber;
        return sumFirstAndLast;
    }
}

public class CodingExercise17 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int digit = 0;
        int evenSum = 0;
        while (number > 0) {
            digit = number % 10;
            if ((digit & 1) == 0) {
                evenSum = evenSum + digit;
            }
            number = number / 10;
        }
        return evenSum;
    }

}

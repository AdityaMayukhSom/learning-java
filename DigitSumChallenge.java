public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(999));
    }

    /**
     * @return sum of the digits of the input number.
     * @throws -1 if the number is less than or equal to zero.
     */

    public static int sumDigits(int num) {
        int digit = 0, sum = 0;
        if (num <= 0) {
            return -1;
        }
        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
}

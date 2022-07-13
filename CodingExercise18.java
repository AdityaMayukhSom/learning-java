public class CodingExercise18 {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(55, 99));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
            return false;
        }
        int digit1 = 0;
        int digit2 = 0;
        int num2_copy = num2;
        while (num1 > 0) {
            digit1 = num1 % 10;
            while (num2_copy > 0) {
                digit2 = num2_copy % 10;
                if (digit2 == digit1) {
                    return true;
                }
                num2_copy = num2_copy / 10;
            }
            num2_copy = num2;
            num1 = num1 / 10;
        }

        return false;
    }
}

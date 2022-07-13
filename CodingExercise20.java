public class CodingExercise20 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(18, 9));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int x, int y) {
        if (x < 10 || y < 10) {
            return -1;
        }

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        if (y % x == 0) {
            return x;
        }

        for (int i = x / 2; i >= 1; i--) {
            if ((x % i == 0) && (y % i == 0)) {
                return i;
            }
        }

        return -1;
    }
}

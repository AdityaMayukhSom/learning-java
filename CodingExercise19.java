public class CodingExercise19 {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(99, 22, 71));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            int x_last = x % 10;
            int y_last = y % 10;
            int z_last = z % 10;
            if ((z_last == x_last) || (x_last == y_last) || (y_last == z_last)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        } else {
            return true;
        }
    }
}

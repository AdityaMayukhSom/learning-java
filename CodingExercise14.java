public class CodingExercise14 {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }

    public static boolean isOdd(int num) {
        if (!(num > 0)) {
            return false;
        }
        if ((num & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start > end || end <= 0 || start <= 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

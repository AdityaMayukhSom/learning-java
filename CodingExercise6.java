public class CodingExercise6 {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 2));
    }

    public static boolean hasEqualSum(int num1, int num2, int sum) {
        if ((num1 + num2) == sum) {
            return true;
        } else {
            return false;
        }
    }
}

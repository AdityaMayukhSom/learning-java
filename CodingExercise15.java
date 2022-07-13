public class CodingExercise15 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            num = (-1) * num;
        }
        int original_num = num;
        int new_num = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            new_num = (new_num * 10) + digit;
            num = num / 10;
        }
        if (new_num == original_num) {
            return true;
        } else {
            return false;
        }
    }
}

public class CodingExercise7 {
    public static void main(String[] args) {
        System.out.println(hasTeen(34, 23, 78));
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if (isTeen(age1) || isTeen(age2) || isTeen(age3)) {
            return true;
        } else {
            return false;
        }
    }
}

public class CodingExercise5 {
    public static void main(String args[]) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // The numbers needs to be equal upto 3 decimal places.
        // that means up to 3 decimal places, their signs should also match.
        int intNum1 = (int) (num1 * 1000);
        int intNum2 = (int) (num2 * 1000);
        if (intNum1 == intNum2) {
            return true;
        } else {
            return false;
        }
    }
}

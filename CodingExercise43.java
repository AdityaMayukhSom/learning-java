import java.util.Arrays;

public class CodingExercise43 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 4, 7, 5, 9, 7, 0, 2 };
        System.out.println("Original Array Is " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array Is " + Arrays.toString(arr));
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int temp;
        int n = array.length;
        for (int i = 0; i <= (n / 2); i++) {
            temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}

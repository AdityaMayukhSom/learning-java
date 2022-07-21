import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Array declarations.
        // int[] myFirstArray = { 6, 10, 12 };
        // int[] mySecondArray = new int[10];

        int[] array = getArray(10);
        printArrays(array);
        System.out.println("Average Of Array Is " + averageArray(array));
    }

    public static void printArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] getArray(int number) {
        System.out.println("Enter " + number + " number.");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static double averageArray(int[] array) {
        double average = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        average = sum / array.length;
        return average;
    }
}
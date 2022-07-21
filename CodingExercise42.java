import java.util.Scanner;

public class CodingExercise42 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Number Of Elements In Array: ");
        int n = readInteger();
        int[] arr = readElements(n);
        System.out.println("The Minimum Value In Array Is " + findMin(arr));
    }

    private static int readInteger() {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    private static int[] readElements(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}

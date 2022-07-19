import java.util.Scanner;

public class SortArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Number Of Elements In Array: ");
        int n = scanner.nextInt();

        int[] array = getArray(n);
        printArray(array);

        sortIntegersSameArray(array);
        printArray(array);
    }

    public static int[] getArray(int arrayLength) {
        int[] array = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " Integers");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print("]\n");
    }

    public static int[] sortIntegersNewArray(int[] inputArr) {
        int[] outputArr = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            int maxIndex = 0;
            for (int j = 0; j < inputArr.length; j++) {
                if (inputArr[j] > inputArr[maxIndex]) {
                    maxIndex = j;
                }
            }
            outputArr[i] = inputArr[maxIndex];
            inputArr[maxIndex] = Integer.MIN_VALUE;
        }
        return outputArr;
    }

    public static void sortIntegersSameArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[maxIndex] < array[j]) {
                    maxIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }
}

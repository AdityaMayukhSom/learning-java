public class CodingExercise10 {
    public static void main(String[] args) {
        printEqual(1, 2, 1);
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if ((x == y) && (y == z)) {
            System.out.println("All numbers are equal");
            return;
        } else if ((x != y) && (y != z) && (z != x)) {
            System.out.println("All numbers are different");
            return;
        } else {
            System.out.println("Neither all are equal or different");
            return;
        }
    }
}

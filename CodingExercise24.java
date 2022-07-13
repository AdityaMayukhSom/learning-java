public class CodingExercise24 {
    public static void main(String[] args) {
        System.out.println(canPack(1, -1, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int neededBigCount = bigCount;
        while (5 * neededBigCount > goal) {
            neededBigCount = neededBigCount - 1;
        }
        int neededSmallCount = goal - (neededBigCount * 5);
        if (neededSmallCount <= smallCount) {
            return true;
        } else {
            return false;
        }
    }
}

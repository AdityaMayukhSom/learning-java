public class Sum3And5Challenge {
    public static void main(String[] args) {
        int x = printNumbersDividedBy3and5();
        System.out.println("The Sum Of 5 Numbers Is " + x);
    }

    public static int printNumbersDividedBy3and5() {
        int count = 5;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println(i);
                sum = sum + i;
                count--;
            }
            if (count == 0) {
                break;
            }

        }

        return sum;

    }
}
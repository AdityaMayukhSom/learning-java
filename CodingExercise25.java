public class CodingExercise25 {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int x) {
        if (x < 0) {
            return -1;
        }
        // If the number is 1, the first for loop will not get executed,
        // hence it will return 1.
        // which is not accurate in case of this question,
        // hence we have to use a fallback.
        if (x == 1 || x == 0) {
            return -1;
        }
        boolean isTheNumberPrime = true;
        for (int j = 2; j * j <= x; j++) {
            if (x % j == 0) {
                isTheNumberPrime = false;
            }
        }
        if (isTheNumberPrime) {
            return x;
        }
        int largestPrime = -1;
        for (int i = x / 2; i >= 2; i--) {
            if (x % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    largestPrime = i;
                    break;
                }
            }
        }
        return largestPrime;
    }
}

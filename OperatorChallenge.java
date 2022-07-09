public class OperatorChallenge {
    public static void main(String[] args) {
        double myNum = 37.00;
        double var1 = 20.00;
        double var2 = 80.00;
        double result = (var1 + var2) * 100;
        // int quotient = (int) (result / myNum);
        double remainder = result % myNum;
        boolean isRemainderZero = (remainder == 0);
        if (isRemainderZero) {
            System.out.println("The remainder is zero.");
        } else {
            System.out.println("Got some remainder. The remainder is " + remainder);
        }
    }
}

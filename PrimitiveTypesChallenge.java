public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByte = 24;
        short myShort = 1058;
        int myInt = 2640;
        long myLong = 50000L + 10L * (myByte + myInt + myShort);
        System.out.println(myLong);
    }
}

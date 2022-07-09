public class PrimitiveTypes {
    public static void main(String[] args) {
        /* There are 8 different primitive data types in Java */
        /* Namely int, boolean, byte, char, short, int, long, float, double */
        // Integer is called a wrapper class
        // Java uses wrapper class for all eight primitive types
        // By doing this, it gives us ways to perform operations on an int

        // Integer occupies 32 bit
        int integerMinValue = Integer.MIN_VALUE;
        int integerMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + integerMinValue);
        System.out.println("Integer Maximum Value = " + integerMaxValue);

        /* This will create an underflow */
        System.out.println("Busted Min Value = " + (integerMinValue - 1));
        /* It will create an overflow */
        System.out.println("Busted Max Value = " + (integerMaxValue + 1));

        // A Byte occupies 8 bit
        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;

        System.out.println("Byte Minimum Value = " + byteMinValue);
        System.out.println("Byte Maximum Value = " + byteMaxValue);

        // Short occupies 16 bit
        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + shortMinValue);
        System.out.println("Short Maximum Value = " + shortMaxValue);

        // Long uses 64 bit, and assigning long values generally end with 'L'
        long longMaxValue = Long.MAX_VALUE;
        long longMinValue = Long.MIN_VALUE;
        long myLongVariable = 2147483647123L;

        System.out.println(myLongVariable);
        System.out.println("Long Maximum Value = " + longMaxValue);
        System.out.println("Long Minimum Value = " + longMinValue);

        /* Division By Integer Always Gives Integer */
        byte negativeHalfByte = (byte) (byteMinValue / 2);
        System.out.println(negativeHalfByte);

    }
}

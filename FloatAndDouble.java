public class FloatAndDouble {

    // There are two primitive types representing decimal numers.
    // They are float and double
    // Precision refers to the format and amount of space occupied by the type.
    // Single precision occupies 32 bits (so has a width of 32)
    // Double precison occupies 64 bts (and thus has a width of 64)
    public static void main(String[] args) {
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Min Value Is = " + floatMinValue);
        System.out.println("Float Max Value Is = " + floatMaxValue);

        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Min Value Is = " + doubleMinValue);
        System.out.println("Double Max Value Is = " + doubleMaxValue);

        // By default, a floating point number is assumed to be Double.
        // By default a whole number is assumed to be an Integer.

        int myIntValue = 5 / 2;
        float myFloatValue = 5F / 2F; // Thus we have to specifically mention F for float
        // Else we have to typecast this to float using (float)
        // float myFloatValue = (float) (5.25);
        double myDoubleValue = 5D / 2D;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

    }
}

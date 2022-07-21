import java.util.ArrayList;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {

        // ArrayList<Byte> byteArray = new ArrayList<Byte>();
        // ArrayList<Short> shortArray = new ArrayList<Short>();

        ArrayList<Integer> intArray = new ArrayList<Integer>();

        // ArrayList<Long> longArray = new ArrayList<Long>();
        // ArrayList<Float> floatArray = new ArrayList<Float>();

        ArrayList<Double> doubleArray = new ArrayList<Double>();

        // ArrayList<Character> characterArray = new ArrayList<Character>();
        // ArrayList<Boolean> booleanArray = new ArrayList<Boolean>();

        for (int i = 0; i < 10; i++) {
            // Autoboxing
            // Converting Primitive Type To An Object Wrapper
            intArray.add(Integer.valueOf(i));
        }

        for (int i = 0; i < intArray.size(); i++) {
            // Unboxing
            // Taking Out The Primitive Type From Object Wrapper
            System.out.print(intArray.get(i).intValue() + " ");
        }

        System.out.println();

        Integer myIntValue = 45;
        // Is same as Integer myIntValue = Integer.valueOf(45);
        // The code will change to Integer.valueOf(45) at compile time
        // We did not have write new Integer(45);
        System.out.println(myIntValue);
        System.out.println(myIntValue.intValue());
        int myInt = myIntValue;
        // Same as myIntValue.intValue();
        System.out.println(myInt);

        for (double dbl = 0.0; dbl <= 10.0; dbl = dbl + 0.5) {
            // Autoboxing
            doubleArray.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < doubleArray.size(); i++) {
            // Unboxing
            System.out.print(doubleArray.get(i).doubleValue() + " ");
        }
    }
}

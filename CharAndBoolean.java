public class CharAndBoolean {
    public static void main(String[] args) {
        // Single quote is used to define a character
        // Double quote is used to define a string
        // Char can store only a single character
        // Char occupies two bytes of memory, i.e 16 bit
        // It allows you to store unicode character
        char myChar = 'D';

        // Writing unicode characters
        // \ u to represent unicode character
        char myUnicode = '\u0040'; // Unicode character for D
        System.out.println(myChar);
        System.out.println(myUnicode);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
    }
}

public class Strings {
    public static void main(String[] args) {
        // A String is a sequence of characters.
        // char could contain only a single character.
        // (regular character or unicode character)

        // A String can contain a sequence of characters. A large number of characters.
        // Technically it's limited by the memory or the MAX_VALUE of an int.
        // Max value of int was 2.14 Billion.
        // That's a lot of characters.

        String myString = "This is my string";
        myString = "My name is aditya and " + myString;
        System.out.println(myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 30;
        double myDoubleNumber = 52.2148;

        // In case of concatenation, java converts numbers to strings
        // Strings in java are immutable
        lastString = lastString + myInt + myDoubleNumber;
        System.out.println(lastString);

    }
}

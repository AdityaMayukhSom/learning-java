public class CodingExercise4 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2004));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear;
        // If the year is not between 9999 and 1,
        // return false without checking the rest of the code
        if (year > 9999 || year < 1) {
            return false;
        }

        // Else first checkk if the year is divisible by 400
        // If yes obviously it is a leap year so return true or set leapyear = true
        if (year % 400 == 0) {
            leapYear = true;
        } else if (year % 100 == 0) {
            // If year is not divisible by 400 but is divisible by 100;
            // Then it is in form 1500, 1800 etc.
            // hence return false or set leapyear = false
            leapYear = false;
        } else if (year % 4 == 0) {
            // If year is not divisible by both 400 and 100 but is divisible by 4;
            // Then it is in form 2004,2008 etc.
            // hence is it a leap year
            // so return true or set leapyear = true
            leapYear = true;
        } else {
            // in all other cases return false
            leapYear = false;
        }
        return leapYear;
    }
}

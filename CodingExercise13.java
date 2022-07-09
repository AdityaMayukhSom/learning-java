public class CodingExercise13 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static boolean isLeapYear(int year) {
        if (year > 9999 || year < 1) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int monthArr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return monthArr[month - 1];
        }
    }
}

public class CodingExercise23 {
    public static void main(String[] args) {
        numberToWords(-11);
    }

    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (num == 0) {
            System.out.println("Zero");
            return;
        }

        int digit = 0;
        int originalNum = num;
        int reversedNum = reverse(num);
        int originalNumDigit = getDigitCount(originalNum);
        int reverseNumDigit = getDigitCount(reversedNum);
        int zeroCount = originalNumDigit - reverseNumDigit;

        while (reversedNum > 0) {
            digit = reversedNum % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            reversedNum = reversedNum / 10;
        }

        int zeroPrinted = 0;
        while (zeroPrinted < zeroCount) {
            System.out.println("Zero");
            zeroPrinted++;
        }
    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 1;
        }
        int digitCount = 0;
        while (num > 0) {
            digitCount++;
            num = num / 10;
        }
        return digitCount;
    }

    public static int reverse(int num) {
        int originalNum = num;
        int reverseNum = 0;
        int digit = 0;

        if (originalNum < 0) {
            num = num * -1;
        }

        while (num > 0) {
            digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        }

        if (originalNum < 0) {
            reverseNum = reverseNum * -1;
        }

        return reverseNum;
    }
}

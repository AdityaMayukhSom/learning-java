public class Switch {
    public static void main(String[] args) {
        int value = 1;
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        String monthName = "January";
        switch (monthName.toLowerCase()) {
            case "january":
                System.out.println("jan - 1");
                break;
            case "february":
                System.out.println("feb - 2");
                break;
            case "march":
                System.out.println("mar - 3");
                break;
            case "april":
                System.out.println("apr - 4");
                break;
            case "may":
                System.out.println("may - 5");
                break;
            case "june":
                System.out.println("jun - 6");
                break;
            case "july":
                System.out.println("jul - 7");
                break;
            case "august":
                System.out.println("aug - 8");
                break;
            case "september":
                System.out.println("sep - 9");
                break;
            case "october":
                System.out.println("oct - 10");
                break;
            case "november":
                System.out.println("nov - 11");
                break;
            case "december":
                System.out.println("dec - 12");
                break;
            default:
                System.out.println("Not a month");
                break;
        }
    }
}

public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(122, 56));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE;
        }
        int hours = (int) minutes / 60;
        minutes = minutes - (hours * 60);
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = minutes + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        String hmsString = hoursString + " " + minutesString + " " + secondsString;
        return hmsString;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE;
        }
        int minutes = (int) seconds / 60;
        seconds = seconds - (minutes * 60);
        return getDurationString(minutes, seconds);
    }
}

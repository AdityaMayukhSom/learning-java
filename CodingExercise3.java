public class CodingExercise3 {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if (!(hourOfDay < 0 || hourOfDay > 23)) {
            if (barking) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    wakeUp = true;
                }
            }
        }
        return wakeUp;
    }
}

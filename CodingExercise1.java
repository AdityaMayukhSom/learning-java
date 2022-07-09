public class CodingExercise1 {
    public static void main(String[] args) {
        double myDouble = -5.69;
        printConversion(myDouble);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = -1;
        if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
            // 1 mile = 1.609 km, hence 1 km = 1/1.609 mile
            // Hence x kilometer = x/1.609 mile
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour;
        milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}

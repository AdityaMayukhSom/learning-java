public class PoundToKilogram {
    public static void main(String[] args) {
        double conversionFactor = 0.45359237;
        double pound = 30;
        double kilogram = pound * conversionFactor;
        // Upto two decimal point precision conversion
        kilogram = Math.round(kilogram * 100) / 100d;
        System.out.println(kilogram);
    }
}

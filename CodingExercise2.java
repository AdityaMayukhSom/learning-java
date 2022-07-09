public class CodingExercise2 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megaByteToKiloByteFactor = 1024;
            int megaBytes = (int) (kiloBytes / megaByteToKiloByteFactor);
            int remainingKiloBytes = (kiloBytes - (megaBytes * megaByteToKiloByteFactor));
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}

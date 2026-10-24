public class UnitCastingConverter {
    public static void main(String[] args) {
        double totalCm = 267.8;

        // Narrowing cast: Converts the measurement to whole meters by removing the decimal part.
        int fullMeters = (int) (totalCm / 100);
        double leftOverCm = totalCm % 100;

        System.out.println("Measurement: " + totalCm + " cm");
        System.out.println("Whole Meters: " + fullMeters);
        System.out.println("Extra Centimeters: " + leftOverCm);
        System.out.println();

        // Implicit Widening
        int wholeValue = 15;

        // No cast is required because Java can automatically store an int value in a double variable.
        double widenedValue = wholeValue;
        System.out.println("Widened Value: " + widenedValue);

        // Explicit Narrowing
        double exactCm = 78.64;

        // Casting a double to an int removes the decimal portion, so 78.64 becomes 78.
        int narrowedCm = (int) exactCm;
        System.out.println("Narrowed Value: " + narrowedCm);
    }
}

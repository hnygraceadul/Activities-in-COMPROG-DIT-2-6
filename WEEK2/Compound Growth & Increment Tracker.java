public class CompoundGrowthIncrementTracker {
    public static void main(String[] args) {
        double balance = 1000.0;

        balance += 200;
        System.out.println("After first growth: " + balance);

        balance += 150;
        System.out.println("After second growth: " + balance);

        balance *= 1.10;
        System.out.println("After third growth: " + balance);

        int count = 5;

        System.out.println("Postfix increment: " + count++);
        System.out.println("After postfix: " + count);

        /*
         * Prefix increment increases the value before printing,
         * while postfix increment prints the current value first
         * before increasing it. Therefore, their printed values differ.
         */
        System.out.println("Prefix increment: " + ++count);
        System.out.println("After prefix: " + count);
    }
}

public class PatternGenerator {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {

            // CONTINUE: Skip row 3
            if (i == 3) {
                continue;
            }

            for (int h = 1; h <= i; h++) {

                // BREAK: Stop the inner loop when h reaches 3
                if (h == 3) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

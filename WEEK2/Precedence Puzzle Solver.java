public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        int a = 3;

        /* Prediction: The result is true because ++a makes a equal to 4,
           so 4 * 2 >= 8 is true, and a++ < 5 is also true. */
        System.out.println("Expression 1: " + ((++a * 2 >= 8) && (a++ < 5)));
        System.out.println("Value of a: " + a);

        int b = 4;

        /* Prediction: The result is true because b-- + 2 == 6 is true.
           The || operator skips the second condition when the first is true. */
        System.out.println("Expression 2: " + ((b-- + 2 == 6) || (++b > 4)));
        System.out.println("Value of b: " + b);

        int c = 2;

        /* Prediction: The result is true because c++ * 3 < 9 is true,
           then --c decreases c back to 2, making the second condition true. */
        System.out.println("Expression 3: " + ((c++ * 3 < 9) && (--c == 2)));
        System.out.println("Value of c: " + c);
    }
}

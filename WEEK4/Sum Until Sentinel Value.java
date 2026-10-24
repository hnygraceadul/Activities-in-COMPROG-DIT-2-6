import java.util.Scanner;

public class SumUntilSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a number (-1 to stop): ");
        number = input.nextInt();

        while (number != -1) {
            sum += number;

            System.out.print("Enter a number (-1 to stop): ");
            number = input.nextInt();
        }

        System.out.println("Final Sum: " + sum);

        input.close();
    }
}

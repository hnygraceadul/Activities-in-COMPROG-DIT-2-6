public class OverflowReferenceInvestigator {
    public static void main(String[] args) {

        /*
         * Byte Overflow:
         * The maximum value of a byte is 127.
         * Adding 1 makes the value wrap around to -128.
         */
        byte number = 127;
        number++;
        System.out.println("Byte after overflow: " + number);

        /*
         * String Reference Comparison:
         * Both Strings contain the same text but are separate objects.
         * The == operator returns false because their references are different.
         */
        String text1 = new String("coffee");
        String text2 = new String("coffee");

        System.out.println("Using == : " + (text1 == text2));

        /*
         * The equals() method compares the contents of the Strings.
         * Since both contain "coffee", the result is true.
         */
        System.out.println("Using equals(): " + text1.equals(text2));

        /*
         * String Literal Comparison:
         * Identical String literals refer to the same object.
         * Therefore, the == operator returns true.
         */
        String text3 = "bean";
        String text4 = "bean";

        System.out.println("Literal == : " + (text3 == text4));
        System.out.println("Literal equals(): " + text3.equals(text4));

        /*
         * Shared Array Reference:
         * Both variables refer to the same array containing 3 elements.
         * Changing the third element through firstArray also affects secondArray.
         */
        int[] firstArray = {10, 20, 30};
        int[] secondArray = firstArray;

        firstArray[2] = 99;

        System.out.println("First array value: " + firstArray[2]);
        System.out.println("Second array value: " + secondArray[2]);
    }
}

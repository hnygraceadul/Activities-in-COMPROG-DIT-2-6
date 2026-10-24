public class GradeThresholdChecker {
    public static void main(String[] args) {
        double average = 88;
        int absences = 2;

        if ((average >= 75 && absences <= 3) || average >= 90) {
            System.out.println("PASS: The student meets the requirements.");
        } else {
            System.out.println("FAIL: The student does not meet the requirements.");
        }
    }
}

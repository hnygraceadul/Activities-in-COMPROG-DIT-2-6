import java.util.Arrays;

public class SearchSortMiniTool {
    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88, 76, 95, 80};
        int target = 92;
        int index = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(target + " was found at index " + index);
        } else {
            System.out.println(target + " was not found.");
        }

        // Sorting a copy preserves the original array order and keeps the original indexes unchanged.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array: " + Arrays.toString(sortedScores));
    }
}

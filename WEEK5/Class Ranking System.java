class Student {
    String name;
    int[] quizzes;
    double average;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;

        int sum = 0;
        for (int i = 0; i < quizzes.length; i++) {
            sum += quizzes[i];
        }

        average = (double) sum / quizzes.length;
    }
}

public class ClassRankingSystem {
    public static void main(String[] args) {

        String[] names = {
            "Kaith", "John", "Annika", "Mae", "Lei"
        };

        int[][] quizData = {
            {90, 85, 88, 92},
            {80, 85, 90, 85},
            {95, 90, 92, 91},
            {85, 80, 88, 87},
            {90, 85, 88, 92}
        };

        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        // Own sorting algorithm: Bubble Sort, highest average first
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("========== CLASS LEADERBOARD ==========");
        System.out.printf("%-8s %-12s %-10s %-10s%n",
                "Rank", "Name", "Average", "Quizzes");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            // Students with equal averages share the same rank
            if (i > 0 &&
                students[i].average != students[i - 1].average) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f ",
                    rank, students[i].name, students[i].average);

            for (int j = 0; j < students[i].quizzes.length; j++) {
                System.out.print(students[i].quizzes[j] + " ");
            }

            System.out.println();
        }

        // Custom linear search: find a student's rank by name
        String searchName = "Kaith";
        int foundRank = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(searchName)) {
                if (i == 0 ||
                    students[i].average != students[i - 1].average) {
                    foundRank = i + 1;
                } else {
                    foundRank = foundRankForTie(students, i);
                }
                break;
            }
        }

        if (foundRank != -1) {
            System.out.println("\n" + searchName + "'s rank: " + foundRank);
        } else {
            System.out.println("\nStudent not found: " + searchName);
        }
    }

    static int foundRankForTie(Student[] students, int index) {
        while (index > 0 &&
               students[index].average == students[index - 1].average) {
            index--;
        }
        return index + 1;
    }
}

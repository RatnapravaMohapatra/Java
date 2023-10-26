import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0.0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        double average = totalMarks / numSubjects;
        String letterGrade = calculateLetterGrade(average);

        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }

    public static String calculateLetterGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}

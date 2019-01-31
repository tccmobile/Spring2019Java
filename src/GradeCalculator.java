import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final double HOMEWORK_MAX = 80.0;
        final double MIDTERM_MAX = 40.0;
        final double FINAL_MAX = 70.0;
        final double QUIZ_MAX = 20.0;

        final double HOMEWORK_WEIGHT = 0.10;
        final double MIDTERM_WEIGHT = 0.30;
        final double FINAL_WEIGHT = 0.45;
        final double QUIZ_WEIGHT = 0.15;


        double quizScore;
        double homeworkScore;
        double midtermScore;
        double finalScore;

        double coursePercentage;

        System.out.println("Enter homework score:");
        homeworkScore = scnr.nextDouble();

        System.out.println("Enter midterm exam score:");
        midtermScore = scnr.nextDouble();

        System.out.println("Enter final exam score:");
        finalScore = scnr.nextDouble();

        System.out.println("Enter quiz score:");
        quizScore = scnr.nextDouble();

        double homeworkPart = ((homeworkScore / HOMEWORK_MAX) * HOMEWORK_WEIGHT);
        double midtermPart = ((midtermScore/MIDTERM_MAX) *MIDTERM_WEIGHT);
        double finalPart = ((finalScore/FINAL_MAX) * FINAL_WEIGHT);
        double quizPart = ((quizScore/QUIZ_MAX) * QUIZ_WEIGHT);


        coursePercentage = homeworkPart + midtermPart + finalPart + quizPart;

        coursePercentage = coursePercentage * 100; // Convert fraction to %

        System.out.print("Your course percentage: ");
        System.out.println(coursePercentage);
    }
}
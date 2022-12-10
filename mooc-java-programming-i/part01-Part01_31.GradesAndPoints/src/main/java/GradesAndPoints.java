
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");

        int points = Integer.valueOf(scan.nextLine());

        String grade;

        if (points > 100) {
            grade = "incredible!";
        } else if (points >= 90) {
            grade = "5";
        } else if (points >= 80) {
            grade = "4";
        } else if (points >= 70) {
            grade = "3";
        } else if (points >= 60) {
            grade = "2";
        } else if (points >= 50) {
            grade = "1";
        } else if (points >= 0) {
            grade = "failed";
        } else {
            grade = "impossible";
        }

        System.out.println("Grade: " + grade);
    }
}

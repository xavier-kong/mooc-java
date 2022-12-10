
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = Integer.valueOf(scan.nextLine());

        String isLeap = "not a leap year.";

        if (year % 4 == 0) {
            isLeap = "a leap year.";
            if (year % 100 == 0 && year % 400 != 0) {
                isLeap = "not a leap year.";
            }
        }

        System.out.println("The year is " + isLeap);
    }
}

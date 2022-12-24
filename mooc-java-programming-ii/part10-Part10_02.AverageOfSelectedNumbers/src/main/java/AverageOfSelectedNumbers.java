
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
          ArrayList<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        if (input.equals("n")) {
          double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s < 0)
            .average()
            .getAsDouble();

        System.out.println("Average of the negative numbers: " + average);


        } else if (input.equals("p")) {
  double average = inputs.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s > 0)
            .average
            .getAsDouble();

        System.out.println("Average of the positive numbers: " + average);


        }


    }
}

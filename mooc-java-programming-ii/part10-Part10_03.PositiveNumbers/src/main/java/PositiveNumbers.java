
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> vals = numbers.stream()
            .filter(s -> s > 0)
            .collect(Collectors.toList());

        return vals;
    }

// 0b 1 2 3 4 5 6 7 8 9

}

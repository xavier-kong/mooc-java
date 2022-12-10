
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int giftVal = Integer.valueOf(scan.nextLine());

        int rate = 0;
        int base = 0;
        int limit = 0;

        if (giftVal > 1000000) {
            base = 142100;
            rate = 17;
            limit = 1000000;
        } else if (giftVal >= 200000) {
            base = 22100;
            rate = 15;
            limit = 200000;
        } else if (giftVal >= 55000) {
            base = 4700;
            rate = 12;
            limit = 55000;
        } else if (giftVal >= 25000) {
            base = 1700;
            rate = 10;
            limit = 25000;
        } else if (giftVal >= 5000) {
            base = 100;
            rate = 8;
            limit = 5000;
        }

        int excess = giftVal - limit;

        double processedRate = (1.0 * rate) / 100;

        double tax = base + (excess * processedRate);

        if (giftVal < 5000) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
    }
}

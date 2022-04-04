import java.util.Locale;
import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a food from the above List\n" +
                "1)\t~\tKabab\n" +
                "2)\t~\tBolani\n" +
                "3)\t~\tBurger\n" +
                "4)\t~\tUzbek Palaw");
        String food = input.nextLine().toLowerCase(Locale.ROOT).trim();
    }
}

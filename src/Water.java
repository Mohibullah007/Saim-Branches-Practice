import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a water from the above List\n" +
                "1)\t~\tMineral water\n" +
                "2)\t~\tPurified Water");
        String water = input.nextLine();
    }
}

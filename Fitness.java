import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt(); // Distance between home and office

            int weeklyDistance = 2 * x * 5; // Calculate the total distance Chef travels in a week
            System.out.println(weeklyDistance); // Print the result
        }

        scanner.close();
    }
}


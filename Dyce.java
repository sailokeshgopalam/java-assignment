import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read the numbers on the dice for Chef and Chefina
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Check if the sum of the numbers is greater than 6
            if (X + Y > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        // Close the scanner to release resources
        scanner.close();
    }
}

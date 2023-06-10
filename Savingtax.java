import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt(); // Amount earned
            int y = scanner.nextInt(); // Tax threshold

            int minimumInvestment = Math.max(0, x - y); // Calculate the minimum amount to invest
            System.out.println(minimumInvestment); // Print the result
        }

        scanner.close();
    }
}


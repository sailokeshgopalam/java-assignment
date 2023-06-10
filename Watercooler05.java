import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int i = 0; i < T; i++) {
            // Read X, Y, and M for the current test case
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int M = scanner.nextInt();

            // Calculate the cost of renting the cooler for M months
            int rentCost = X * M;

            if (rentCost < Y) {
                System.out.println("YES");  // Chef should rent the cooler
            } else {
                System.out.println("NO");  // Chef should purchase the cooler
            }
        }
    }
}

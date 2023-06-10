import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of soldiers

        int luckySoldiers = 0;
        for (int i = 0; i < n; i++) {
            int weapons = scanner.nextInt(); // Number of weapons for the current soldier

            if (weapons % 2 == 0) {
                luckySoldiers++;
            }
        }

        if (luckySoldiers > n / 2) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
    }
}


package string_manipulation;

import java.io.IOException;
import java.util.Scanner;

public class CommonChild { // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
return  LCM4(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());

    }

    public static int LCM4(char[] x, char[] y, int m, int n) {
        int memo[] = new int[n + 1];
        for (int i = 1; i <=m; i++) {
            int prev = 0;
            for (int j = 1; j <=n; j++) {
                int temp = memo[j];
                if (x[i - 1] == y[j - 1]) {
                    memo[j] = prev + 1;
                } else {
                    memo[j] = Math.max(memo[j], memo[j - 1]);
                }
                prev =temp;
            }
        }
        return memo[n];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);
        System.out.println(result);

        scanner.close();
    }
}

package warmup;

import java.io.IOException;
import java.util.Scanner;

public class Repeat {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        System.out.println(s);
        long whole = n / s.length();
        int remainder = (int) (n % s.length());
        System.out.println("whole " + whole);
        System.out.println("Remainder " + remainder);
        int found = 0;

        for (char c : s.toCharArray()
        ) {
            if (c == 'a') {
                found++;
            }
        }

        long total = found * whole;
        if (remainder == 0) {
            return total;
        } else {
            String part = s.substring(0, remainder);

            for (char c : part.toCharArray()
            ) {
                if (c == 'a') {
                    total++;
                }

            }
            return total;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println("Result " + result);

        scanner.close();
    }
}
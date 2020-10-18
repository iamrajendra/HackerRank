package string_manipulation;

import java.io.IOException;
import java.util.Scanner;

public class AlternatingCharacters {
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int result = 0;

        for (int i = 0; i < (s.length() - 1); i++)

            // if two alternating characters
            // of string are same
            if (s.charAt(i) == s.charAt(i + 1))
                result++; // then need to
        // delete a character

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            System.out.print(String.valueOf(result));
            System.out.println();
        }


        scanner.close();
    }
}



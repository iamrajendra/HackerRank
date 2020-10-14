package hashtable;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndAnagrams {
    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> str_frequency = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {
                char[] c = s.substring(i, j + 1).toCharArray();
                Arrays.sort(c);
                String k = new String(c);
                if (!str_frequency.containsKey(k)) {
                    str_frequency.put(k, 1);
                } else {
                    str_frequency.put(k, str_frequency.get(k) + 1);
                }
            }
        }
        int anagramPairs = 0;
        for (String k : str_frequency.keySet()) {
            int v = str_frequency.get(k);
            anagramPairs += (v * (v - 1)) / 2;
        }

        return anagramPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);
            System.out.println(result);

        }


        scanner.close();
    }
}

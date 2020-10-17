package string_manipulation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MakingAnagrams {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        // make hash array for both string
        // and calculate frequency of each
        // character
        int a_frequencies[] = new int[26];
        int b_frequencies[] = new int[26];
        int min_deletions = 0;


        // count frequency of each character
        // in first string
        for (int i = 0; i < a.length(); i++) {
            char current_char = a.charAt(i);
            int char_to_int = (int) current_char;
            int position = char_to_int - (int) 'a';
            a_frequencies[position]++;
        }

        // count frequency of each character
        // in second string
        for (int i = 0; i < b.length(); i++) {
            char current_char = b.charAt(i);
            int char_to_int = (int) current_char;
            int position = char_to_int - (int) 'a';
            b_frequencies[position]++;
        }

        for (int i = 0; i < 26; i++) {
            int difference = Math.abs(a_frequencies[i] - b_frequencies[i]);
            min_deletions = min_deletions+ difference;
        }

        return min_deletions;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        System.out.println(res);

        scanner.close();
    }
}

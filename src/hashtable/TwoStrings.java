package hashtable;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoStrings {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        boolean valid =false;
        Map<Character, Integer> mapS1 = new HashMap<Character, Integer>();
        Map<Character, Integer> mapS2 = new HashMap<Character, Integer>();
        for(char word: s1.toCharArray()){
            if (!mapS1.containsKey(word)) mapS1.put(word, 0);
            mapS1.put(word, mapS1.get(word) + 1);
        }

        for(char word: s2.toCharArray()){
            if (!mapS2.containsKey(word)) mapS2.put(word, 0);
            mapS2.put(word, mapS2.get(word) + 1);
        }

        for(Character key: mapS2.keySet()) {
            if (mapS1.containsKey(key)) {
                valid = true;
break;
            }
        }
        return valid?"Yes":"No";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);

        }


        scanner.close();
    }
}


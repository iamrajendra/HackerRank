package hashtable;

import java.util.*;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        boolean valid = false;
        Map<String, Integer> magazineOccurences = new HashMap<String, Integer>();
        Map<String, Integer> ransomOccurences = new HashMap<String, Integer>();

//        it count the  occurrence of the word in the magazine array
        for(String word: magazine){
            if (!magazineOccurences.containsKey(word)) magazineOccurences.put(word, 0);
            magazineOccurences.put(word, magazineOccurences.get(word) + 1);
        }
// it count the occurrence of the word in the note array
        for(String word: note){
            if (!ransomOccurences.containsKey(word)) ransomOccurences.put(word, 0);
            ransomOccurences.put(word, ransomOccurences.get(word) + 1);
        }
// it make sure the  the note contain  the word from magazine and it does not repeat
        for(String key: ransomOccurences.keySet()){
            if (!magazineOccurences.containsKey(key)) {
                valid = false;
            }else {
                valid =true;
            }
            int needed = ransomOccurences.get(key);
            if (magazineOccurences.get(key)!=null && magazineOccurences.get(key) < needed){ valid= false;}
            else if (magazineOccurences.get(key)==null) {
                valid= false;
                break;

            }else {
                valid= true;

            }
        }


        System.out.println(valid?"Yes":"No");











    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);


        scanner.close();
    }
}

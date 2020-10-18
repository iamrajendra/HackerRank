package string_manipulation;

import java.io.IOException;
import java.security.KeyStore;
import java.util.*;

public class SherlockValidString {
    // Complete the isValid function below.
    static String isValid(String s) {
        char[] char_s = s.toCharArray();
        HashMap<Character, Integer> count_char = new HashMap<>();
        for (int i = 0; i < char_s.length; i++) {
            char key = char_s[i];
            if (!count_char.containsKey(key)) {
                count_char.put(key, 1);
            } else {
                count_char.put(key, count_char.get(key) + 1);
            }
        }
        Set<Integer> st = new HashSet<>();
        for(int freq : count_char.values())
        {
            st.add(freq);
        }

        if(st.size() > 2)return  "NO";
        else if(st.size() == 1)return "YES";
        else  {
            int f1 = 0;
            int f2 = 0;
            int f1Count = 0;
            int f2Count = 0;
            int i = 0;
            for(int n : st)
            {
                if(i == 0) f1 = n;
                else f2 = n;
                i++;
            }

            for(int freq : count_char.values())
            {
                if(freq == f1) f1Count++;
                if(freq == f2) f2Count++;
            }



            if((f1 == 1 && f1Count == 1 ) || (f2 == 1 && f2Count == 1 ))
                return "YES";
            else if ((Math.abs(f1 - f2)  == 1) && (f1Count == 1 || f2Count == 1))
                return "YES";
            else
                return "NO";
        }



    }








    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = isValid(s);

        System.out.println(result);
        scanner.close();
    }
}


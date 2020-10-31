package greedyAlgo;

import java.io.IOException;
import java.util.*;

public class LuckBalance {
    // Complete the luckBalance function below.

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        List<Integer> impLuck = new ArrayList<>();
        List<Integer> notLuck = new ArrayList<>();
        Integer luckBal = 0;
        Integer winMach =0;

        for (int i = 0; i < contests.length; i++) {
            int luck = contests[i][0];
            int imp = contests[i][1];

            if (imp==1 ){
                impLuck.add(luck);

            }else {
                notLuck.add(luck);
            }


        }
        Collections.sort(impLuck,Collections.reverseOrder());
        for (int i = 0; i < impLuck.size(); i++) {
            if (i<k)
            luckBal = luckBal +impLuck.get(i);
            else  winMach  = winMach +impLuck.get(i);

        }

        for (int i = 0; i < notLuck.size(); i++) {
            luckBal = luckBal +notLuck.get(i);
        }
        System.out.println("Win Bal ="+winMach);

        luckBal=  luckBal -winMach;
        System.out.println("Luck Bal = " + impLuck);

        return luckBal;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);
        System.out.println(result);

        scanner.close();
    }
}

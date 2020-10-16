package sorting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MarkandToys {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int count = 0;
        if (prices.length ==0 || k ==0) return count;
        Arrays.sort(prices);
        for (int i = 0; i < prices.length; i++) {
k-= prices[i];
if (k<0) return  count;
count++;


        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        System.out.println(result);
        scanner.close();
    }
}

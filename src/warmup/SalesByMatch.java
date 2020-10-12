package warmup;

import java.io.IOException;
import java.util.Scanner;

public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        int frequencyArray[] = new int[ar.length];
        int frequencyTemp = -1;
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                    frequencyArray[j] = frequencyTemp;
                }
            }
            if (frequencyArray[i] != frequencyTemp) {
                frequencyArray[i] = count;
            }
        }

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] != frequencyTemp) {
                int divide = frequencyArray[i] / 2;
                pairs += divide;
            }
        }

        return pairs;
    }




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println("Result is "+result);

        scanner.close();
    }
}

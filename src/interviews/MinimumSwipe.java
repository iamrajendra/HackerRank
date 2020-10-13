package interviews;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwipe {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        boolean[] visitedMap =  new boolean[arr.length];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if (!visitedMap[i]){
                int a =i;
                int b  = arr[i]-1;
                int len =1;
                visitedMap[i] =true;
                while (b!=i){
                    visitedMap[b] =true;
                    a=b;
                    b =arr[b]-1;
                    len++;

                }
                sum += (len-1);
            }

        }

return sum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println(res);

        scanner.close();
    }
}

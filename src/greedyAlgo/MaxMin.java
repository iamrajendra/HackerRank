package greedyAlgo;

import java.io.IOException;
import java.util.*;

public class MaxMin {
    // Complete the maxMin function below.
    static int maxMin(int k, int[] list) {
     Arrays.sort(list);
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < list.length - k+1; i++) {
            int j   = i+(k-1);
            System.out.println("i = " + list[i] + ", j = " +list[j]);
            System.out.println("max = " + Math.max(list[i],list[j]) + ", min = " +Math.min(list[i],list[j]));
            min = Math.min(min,Math.max(list[i],list[j]) - Math.min(list[i],list[j]));
            System.out.println("min = "+min);





        }
        return  min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);

        System.out.println(result);

        scanner.close();
    }
}

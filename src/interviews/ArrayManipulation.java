package interviews;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] compute = new long [n];
        long a, b, k;
        long max = 0;
        for (int i = 0; i < queries.length; i++) {
            a = queries[i][0] - 1;
            b = queries[i][1] - 1;
            k = queries[i][2];

            for (long j = a; j <= b; j++) {
                compute[(int) j] = compute[(int) j] + k;


            }


        }
        max = compute[0];
        for (int j = 0; j < compute.length; j++) {
            max = Math.max(max, compute[j]);
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);


        scanner.close();
    }
}

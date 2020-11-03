package search;

import java.io.IOException;
import java.util.*;

public class TripletSolution {
    // Complete the triplets function below.





    static int findBeforeCount(int[] x, int number) {
        int index = Arrays.binarySearch(x, number);
        if (index < 0) {
            index = -1 - index - 1;
        }
        return index + 1;
    }

    static int[] buildSortedSet(int[] x) {
        return Arrays.stream(x).distinct().sorted().toArray();
    }
    static long triplets(int[] a, int[] b, int[] c) {

        int[] sortedSetA = buildSortedSet(a);
        int[] sortedSetB = buildSortedSet(b);
        int[] sortedSetC = buildSortedSet(c);

        long result = 0;
        for (int numberB : sortedSetB) {
            result += (long) findBeforeCount(sortedSetA, numberB) * findBeforeCount(sortedSetC, numberB);
        }
        return result;








    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] lenaLenbLenc = scanner.nextLine().split(" ");

        int lena = Integer.parseInt(lenaLenbLenc[0]);

        int lenb = Integer.parseInt(lenaLenbLenc[1]);

        int lenc = Integer.parseInt(lenaLenbLenc[2]);

        int[] arra = new int[lena];

        String[] arraItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lena; i++) {
            int arraItem = Integer.parseInt(arraItems[i]);
            arra[i] = arraItem;
        }

        int[] arrb = new int[lenb];

        String[] arrbItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lenb; i++) {
            int arrbItem = Integer.parseInt(arrbItems[i]);
            arrb[i] = arrbItem;
        }

        int[] arrc = new int[lenc];

        String[] arrcItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lenc; i++) {
            int arrcItem = Integer.parseInt(arrcItems[i]);
            arrc[i] = arrcItem;
        }

        long ans = triplets(arra, arrb, arrc);

        System.out.println(ans);
        scanner.close();
    }
}



package interviews;

import java.io.IOException;
import java.util.Scanner;

public class LeftRotate {


    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
int size  = a.length;
int [] rotated_arr = new int[size];
int i =0;
int rotate_index  =d;
while (rotate_index<size){
    rotated_arr[i] = a[rotate_index];
    i++;
    rotate_index++;
}

rotate_index =0;
while (rotate_index< d){
    rotated_arr[i] = a[rotate_index];
    i++;
    rotate_index++;
}

     return    rotated_arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }


        scanner.close();
    }

}

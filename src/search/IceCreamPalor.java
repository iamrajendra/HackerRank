package search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class IceCreamPalor {
    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        HashMap<Integer,Integer>  visited  = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
                visited.put(cost[i], i + 1);


        }
Arrays.sort(cost);

        for (int i = 0; i < cost.length-1; i++) {

            if (cost[Math.max(0,i-1)]+cost[i+1]==money){

                    System.out.println(visited.get(Math.max(0,cost[i-1]))+","+visited.get(cost[i+1]));
                }

        }


    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}

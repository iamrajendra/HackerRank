package sorting;

import java.io.IOException;
import java.util.*;

public class FraudulentActivityNotifications {// Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        List<Integer> bucket  = new ArrayList<>();
        int notify =0;
        float median =0;
        int lastElement = 0;

        int  exp  = expenditure.length;
        for (int i = 0; i < exp; i++) {

            for (int j = i; j < d+i; j++) {
                if (j<expenditure.length) {
                    bucket.add(expenditure[j]);
                 }
                if (j<expenditure.length-1) {

                    lastElement = expenditure[j + 1];
                }

            }
            Collections.sort(bucket);
            if (bucket.size()<d){
                break;
            }

            System.out.println(bucket.toString());

            if (d%2 ==0){
                median  = (float) ((bucket.get(d/2-1)+ bucket.get((d/2-1)+1)))/2;
            }else {
              median =   (float)(bucket.get((d/2-1 +1)));
            }


            if (median*2 <=lastElement){
                notify++;
            }

            if (lastElement!=0) {
                lastElement = 0;
            }

            bucket.clear();
        }


        return notify;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        System.out.println(result);


        scanner.close();
    }
}


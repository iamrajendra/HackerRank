package interviews;

import java.util.Arrays;
import java.util.Scanner;

public class NewYearChao {


    /*function minimumBribes(queue) {
        let chaotic = false
        var bribes = 0
        for (let i = 0; i < queue.length; i++) {
            if (queue[i] — (i+1) > 2) { chaotic = true }
            for (let j = 0; j < i; j++) {
                if (queue[j] > queue[i]) { bribes++ }
            }
        }
        if(chaotic === true){
            console.log(“Too chaotic”)
        } else {
            console.log(bribes)
        }
    }*/
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] queue) {
        boolean chaotic = false;
        int bribes = 0;
        for (int i = 0; i < queue.length; i++) {

            if (queue[i] - (i + 1) > 2) {
                chaotic = true;
            }
            for (int j = 0; j < i; j++) {
                if (queue[j] > queue[i]) {
                    bribes++;
                }
            }

        }
        if (chaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribes);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

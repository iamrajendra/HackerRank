package warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
     char[] arr=   path.toCharArray();
     int countValley =0;
     int altitude =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='D'){
                altitude--;
            }else if(arr[i]=='U'){
                altitude++;
                if (altitude==0){
                    countValley ++;
                }
            }


        }
return  countValley;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = CountingValleys.countingValleys(steps, path);
System.out.println("Result is "+result);

        bufferedReader.close();
        }
}

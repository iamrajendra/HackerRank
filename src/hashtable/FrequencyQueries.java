package hashtable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FrequencyQueries {
    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        int[] quantities = new int[queries.size() + 1];
        List<Integer> result = new ArrayList<>();
        int frequency, value;

        for (int i = 0; i < queries.size(); i++) {


            value = queries.get(i).get(1);
            switch (queries.get(i).get(0)) {
                case 1:
                    // process fq
                    frequency = frequencies.getOrDefault(value, 0);
                    frequencies.put(value, frequency + 1);
                    // process qt
                    quantities[frequency]--;
                    quantities[frequency + 1]++;
                    break;
                case 2:
                    // process fq
                    frequency = frequencies.getOrDefault(value, 0);
                    if (frequency == 0) break;
                    if (frequency == 1) frequencies.remove(value);
                    else frequencies.put(value, frequency - 1);
                    // process qt
                    quantities[frequency]--;
                    quantities[frequency - 1]++;
                    break;
                case 3:
                    if (value >= quantities.length) result.add(0);
                    else result.add(quantities[value] > 0 ? 1 : 0);
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        System.out.println("Result");
            System.out.println("answer = " + ans);



        bufferedReader.close();
         }
}


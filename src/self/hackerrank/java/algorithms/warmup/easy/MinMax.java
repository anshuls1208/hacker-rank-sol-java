package self.hackerrank.java.algorithms.warmup.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
        miniMaxSum(Arrays.asList(1, 3, 5, 7, 9));
    }

    /**
     * 1. sort the array
     * 2. Calculate sum (0-3) then sum (1-4).
     * 3. Print
     *
     * @param arr
     */
    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        long min = 0;
        long max = 0;

        for (int i = 0; i < 5; i++) {
            if (i != 4) {
                min = min + arr.get(i);
            }
            if (i != 0) {
                max = max + arr.get(i);
            }
        }

        System.out.println(min + " " + max);

    }

}

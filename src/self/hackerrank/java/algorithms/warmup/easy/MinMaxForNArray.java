package self.hackerrank.java.algorithms.warmup.easy;

import java.util.Arrays;
import java.util.List;

public class MinMaxForNArray {

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
        miniMaxSum(Arrays.asList(213, 345452466, 123, 345452466, 945452466, 2234, 32123, 4234, 6562, 234, 4526, 257, 3));
    }

    /*
    1. Find min and max, and sum of array.
    2. Subtract min from sum
    3. subtract max from sum.
     */
    public static void miniMaxSum(List<Integer> arr) {

        long min = Long.MAX_VALUE;
        long max = 0;
        long sum = 0;

        for (int i : arr
        ) {

            if (min > i) {
                min = i;
            }

            if (max < i) {
                max = i;
            }

            sum = sum + i;

        }

        System.out.println((sum - max) + " " + (sum - min));

    }

}

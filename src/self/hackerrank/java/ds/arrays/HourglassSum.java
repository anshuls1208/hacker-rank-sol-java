package self.hackerrank.java.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourglassSum {

    public static void main(String[] args) {
        System.out.println(hourglassSum(Arrays.asList(
                                Arrays.asList(1, 1, 1, 0, 0, 0),
                                Arrays.asList(0, 1, 0, 0, 0, 0),
                                Arrays.asList(1, 1, 1, 0, 0, 0),
                                Arrays.asList(0, 0, 2, 4, 4, 0),
                                Arrays.asList(0, 0, 0, 2, 0, 0),
                                Arrays.asList(0, 0, 1, 2, 4, 0)
                        )
                )
        );
    }

    public static int hourglassSum(List<List<Integer>> arr) {

        int max = Integer.MIN_VALUE;

        List<Integer> sums = new ArrayList<>();

        for (int i = 0; i < arr.size() - 2; i++) {

            for (int j = 0; j < arr.size() - 2; j++) {
                sums.add(
                        (arr.get(i)).get(j) + (arr.get(i)).get(j + 1) + (arr.get(i)).get(j + 2)
                                +
                                (arr.get(i + 1)).get(j + 1)
                                +
                                (arr.get(i + 2)).get(j) + (arr.get(i + 2)).get(j + 1) + (arr.get(i + 2)).get(j + 2)

                );
            }
        }

        // calculate max
        for (int x : sums
        ) {
            if (x > max) {
                max = x;
            }
        }

        return max;
    }

}

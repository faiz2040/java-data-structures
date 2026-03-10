package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctDifferenceArray {


    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;

        int[] diff = new int[n];
        int[] leftcount = new int[n];
        int[] rightcount = new int[n];

        HashSet<Integer> seen = new HashSet<Integer>();


        for (int i = 0; i < n; i++) {
            seen.add(nums[i]);
            leftcount[i] = seen.size();
        }

        seen.clear();


        for (int i = n - 1; i >= 0; i--) {
            rightcount[i] = seen.size();
            seen.add(nums[i]);
        }


        for (int i = 0; i < n; i++) {
            diff[i] = leftcount[i] - rightcount[i];
        }

        return diff;
    }


    public static void main(String[] args) {
        DistinctDifferenceArray solution = new DistinctDifferenceArray();


        int[] input1 = {3, 2, 3, 4, 2};


        int[] input2 = {1, 2, 3, 4};


        System.out.println("Input 1: " + Arrays.toString(input1));
        System.out.println("Output 1: " + Arrays.toString(solution.distinctDifferenceArray(input1)));

        System.out.println();

        System.out.println("Input 2: " + Arrays.toString(input2));
        System.out.println("Output 2: " + Arrays.toString(solution.distinctDifferenceArray(input2)));
    }
}
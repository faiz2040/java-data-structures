package ArrayList;

import java.util.Arrays;

public class BuildArrayPermutation {


    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n];


        for (int i = 0; i < n; i++) {

            diff[i] = (nums[nums[i]]);
        }

        return diff;
    }


    public static void main(String[] args) {
        BuildArrayPermutation solution = new BuildArrayPermutation();


        int[] input = {0, 2, 1, 5, 3, 4};


        int[] result = solution.buildArray(input);


        System.out.println("Input:  " + Arrays.toString(input));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
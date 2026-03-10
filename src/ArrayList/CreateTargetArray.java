package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray {


    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;

        // We use ArrayList for its dynamic insert capability.
        // If we insert at index 1, ArrayList automatically shifts elements 1, 2, 3... to the right.
        // This saves us from writing complex shift logic.
        ArrayList<Integer> result = new ArrayList<Integer>();

        // This is the final array we must return (int[])
        int[] target = new int[n];

        // Step 1: Build the list using the Insert logic
        for (int i = 0; i < n; i++) {
            // .add(index, value) inserts 'value' at specific 'index'.
            // If something is already at 'index', it gets pushed to the right.
            result.add(index[i], nums[i]);
        }

        // Step 2: Convert ArrayList back to primitive int[]

        for (int i = 0; i < n; i++) {
            target[i] = result.get(i);
        }

        return target;
    }

    // Main method for local testing
    public static void main(String[] args) {
        CreateTargetArray solution = new CreateTargetArray();

        // Test Case 1
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        System.out.println("Nums:  " + Arrays.toString(nums));
        System.out.println("Index: " + Arrays.toString(index));
        System.out.println("Target: " + Arrays.toString(solution.createTargetArray(nums, index)));
    }
}
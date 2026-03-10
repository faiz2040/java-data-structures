package HashSet;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            } else {
                seen.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {


        ContainsDuplicate solution = new ContainsDuplicate();


        int[] testArray1 = {1, 2, 3, 1};
        boolean result1 = solution.containsDuplicate(testArray1);
        System.out.println("Test Case 1 [1, 2, 3, 1]: " + result1);

        // Test Case 2
        int[] testArray2 = {1, 2, 3, 4};
        boolean result2 = solution.containsDuplicate(testArray2);
        System.out.println("Test Case 2 [1, 2, 3, 4]: " + result2);
    }
}

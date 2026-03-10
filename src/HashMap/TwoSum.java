package HashMap;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum { // Class name changed to TwoSum

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;


        HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int compliment = target - nums[i];

            if (ans.containsKey(compliment)) {

                return new int[] {i, ans.get(compliment)};
            }


            ans.put(nums[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        TwoSum solution = new TwoSum();


        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Input: " + Arrays.toString(nums1) + ", Target: " + target1);
        System.out.println("Output: " + Arrays.toString(result1));

        System.out.println("---------------------");


        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Input: " + Arrays.toString(nums2) + ", Target: " + target2);
        System.out.println("Output: " + Arrays.toString(result2));
    }
}
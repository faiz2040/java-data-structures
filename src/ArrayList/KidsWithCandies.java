package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxcandies = 0;


        for (int i = 0; i < n; i++) {
            if (candies[i] > maxcandies) {
                maxcandies = candies[i];
            }
        }

        ArrayList<Boolean> result = new ArrayList<Boolean>();


        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= maxcandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        KidsWithCandies solution = new KidsWithCandies();


        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println("Candies: " + Arrays.toString(candies));
        System.out.println("Extra:   " + extraCandies);
        System.out.println("Result:  " + solution.kidsWithCandies(candies, extraCandies));
    }
}
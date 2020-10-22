package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSums {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(twoSum(new int[] {2, 7, 13, 3}, 10));
        
    }

    private static List twoSum(int[] nums, int target) {
      final Map<Integer,Integer> map = new HashMap<>();
      for (int i=0; i < nums.length; i++) {
        int diff = target - nums[i];
        if(map.get(diff) != null) {
          ArrayList<Integer> indices = new ArrayList<>();
          indices.add(map.get(diff));//{map.get(diff), nums[i]};
          indices.add(nums[i]);//{map.get(diff), nums[i]};
          return indices;//new ArrayList(indices.length);
        }

        map.put(nums[i],i);

      }

         return null;
    }
}

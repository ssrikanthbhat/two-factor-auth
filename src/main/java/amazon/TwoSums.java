package amazon;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println(twoSum(new int[] {2, 7, 11, 15}, 22));
        
    }

    private static List twoSum(int[] nums, int target) {
        List list = new ArrayList();
        for(int i = 1; i< nums.length; i++) {
             if(nums[i-1] + nums [i] == target) {
                 list.add(i-1);
                 list.add(i);
                 return list;
             }

         }

         return list;
    }
}

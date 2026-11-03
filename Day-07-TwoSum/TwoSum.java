/*
Arrays : 8 
Question : Two Sum(1)
Description : 
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation:
The sum of nums[0] and nums[1] is 2 + 7 = 9, which equals the target. Therefore, the indices [0, 1] are returned.
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2
Explanation:
The sum of nums[1] and nums[2] is 2 + 4 = 6, which equals the target. Therefore, the indices [1, 2] are returned.
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
Difficulty : Easy 
Solution :
 */
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>  hm = new HashMap<>();
       for (int i=0;i<nums.length;i++) {
        int needed = target-nums[i];
        if (hm.containsKey(needed)) {
            return new int[]{hm.get(needed),i};
        }  
        hm.put(nums[i],i); 
   }
   return new int[]{};
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};

        System.out.println(Arrays.toString(sol.twoSum(nums1, 9)));  // [0, 1]
        System.out.println(Arrays.toString(sol.twoSum(nums2, 6)));  // [1, 2]
        System.out.println(Arrays.toString(sol.twoSum(nums3, 6)));  // [0, 1]
    }
}
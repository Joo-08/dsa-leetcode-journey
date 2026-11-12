/*
Two Pointer : 6
Question : 3Sum Closest(16)
Description : 
You are given an integer array nums of length n and an integer target.
Find three integers at distinct indices in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
Difficulty : Medium 
Solution :

 */



import java.util.Arrays;
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n= nums.length;
        int resultsum = nums[0]+nums[1]+nums[2];
        int diff = Integer.MAX_VALUE;
        for (int i=0;i<n;i++) {
            int left =  i+1;
            int right = n-1;
            while (left<right) { 
                int sum = nums[i]+nums[left]+nums[right];
                if (sum==target) {
                    return target;
                }
                else if (sum<target) {
                    left++;
                }
                else if (sum>target) {
                    right--;
                }

                int todiff = Math.abs(sum-target);
                if (todiff<diff) {
                    diff = todiff;
                    resultsum = sum;
                }
            }
        }
    return resultsum;

    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(nums1, 1));   

        int[] nums2 = {0, 0, 0};
        System.out.println(threeSumClosest(nums2, 1));   

        int[] nums3 = {1, 1, 1, 0};
        System.out.println(threeSumClosest(nums3, -100)); 
    }

}
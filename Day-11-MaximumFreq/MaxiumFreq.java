/* Two Pointers : 8
Question :  Count Elements With Maximum Frequency(3005)
Description : 
You are given an array nums consisting of positive integers.
Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
The frequency of an element is the number of occurrences of that element in the array.
Example 1:
Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:
Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
Difficulty : Easy
Solution :
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int num :nums) {
            freq.put(num , freq.getOrDefault(num,0)+1);
        }

        int max = Integer.MIN_VALUE;
        for (int value : freq.values()) {
            if(value>max){
                max = value;
            }
        }

        int count = 0;
        for (Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            if (entry.getValue()==max) {
                count++;
            }
        }
        return count*max;
    }
}

public class MaxiumFreq {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println(sol.maxFrequencyElements(nums1)); 

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(sol.maxFrequencyElements(nums2)); 
    }
}
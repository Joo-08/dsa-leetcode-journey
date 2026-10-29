/* Arrays : 5
Question : Top K Frequent Elements(347)
Description : 
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]
Example 3:
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
Output: [1,2]
Difficulty : Medium
Solution :
*/
import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num , freq.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i).getKey();
        }
        return result;
    }
}

public class TopKFreqElements {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(sol.topKFrequent(nums1, 2)));   // [1, 2]

        int[] nums2 = {1};
        System.out.println(Arrays.toString(sol.topKFrequent(nums2, 1)));   // [1]

        int[] nums3 = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        System.out.println(Arrays.toString(sol.topKFrequent(nums3, 2)));   // [1, 2]
    }
}
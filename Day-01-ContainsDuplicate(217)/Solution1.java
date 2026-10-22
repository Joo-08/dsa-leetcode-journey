/*Arrays : 1 
Question Number : 217 

Description :Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Examples : 
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
Difficulty : Easy

Solution 
can be solved in two ways 
Using hash map 
Using Boolean array

Code
1.Using Hash Map
*/
import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                return true;
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}
public class Solution1 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 1};

        boolean result = solution.containsDuplicate(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);
    }
}


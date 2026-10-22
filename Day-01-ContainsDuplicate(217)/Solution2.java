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

2.using Boolean array(for small range only)
*/
import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }

        boolean seen[] = new boolean[max-min+1]; //this provides a way to handle the negative values in the array as well as decide the range for the array by finding the range btwn the  max and min values in the array
         

        for(int i=0;i<nums.length;i++){

            int val = nums[i]-min;   //mapping the negative values (if present) to positive indexes by calculating how much distance or didgits it is from the min value Subtracting a negative is the same as adding

            if(seen[val]){
                return true;    //already seen duplicate
            }
            seen[val]=true;  //mark it is as seen
        }
        return false;
    }
} 
public class Solution2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 1};

        boolean result = solution.containsDuplicate(nums);
        System.out.println(Arrays.toString(nums) + " -> " + result);
    }
}


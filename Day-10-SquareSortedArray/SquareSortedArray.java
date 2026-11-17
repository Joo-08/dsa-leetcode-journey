/* Two Pointers : 7
Question :  Squares of a Sorted Array(977)
Description : 
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
Difficulty : Easy
Solution :

*/
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int head = 0;
        int tail = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[tail] > nums[head]) {
                result[i] = nums[tail];
                tail--;
            } else {
                result[i] = nums[head];
                head++;
            }
        }

        return result;
    }
}

public class SquareSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] test1 = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sol.sortedSquares(test1)));
       

        int[] test2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sol.sortedSquares(test2)));
        

        int[] test3 = {-5, -3, -2, -1};
        System.out.println(Arrays.toString(sol.sortedSquares(test3)));
        

        int[] test4 = {1, 2, 3};
        System.out.println(Arrays.toString(sol.sortedSquares(test4)));
        


    }
}
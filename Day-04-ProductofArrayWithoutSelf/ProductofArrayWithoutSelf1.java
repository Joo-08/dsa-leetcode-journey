/* Arrays : 4
Question : ProductofArrayWithoutSelf 238
Description : 
iven an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]ṭ
Difficulty : Medium
Solution :
*/

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = R * ans[i];
            R = R * nums[i];
        }

        return ans;
    }
}

public class ProductofArrayWithoutSelf1 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {-1, 1, 0, -3, 3};
        int[] test3 = {3, 4};          // minimum size
        int[] test4 = {0, 0, 2};       // multiple zeros
        int[] test5 = {2, 2, 2};       // duplicates

        System.out.println(Arrays.toString(sol.productExceptSelf(test1)));
        System.out.println(Arrays.toString(sol.productExceptSelf(test2)));
        System.out.println(Arrays.toString(sol.productExceptSelf(test3)));
        System.out.println(Arrays.toString(sol.productExceptSelf(test4)));
        System.out.println(Arrays.toString(sol.productExceptSelf(test5)));
    }
}
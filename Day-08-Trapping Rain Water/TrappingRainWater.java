/*
TwoPointers : 4
Problem : Trapping Rain Water(42)
Description :
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
Difficulty : Hard
Solution : 
1. Create two arrays leftmax and rightmax of size n to store the maximum height to the left and right of each index.
2. Initialize leftmax[0] = height[0] and rightmax[n-1] = height[n-1].
3. Iterate from left to right to fill the leftmax array, where leftmax[i] = Math.max(leftmax[i-1], height[i]).
4. Iterate from right to left to fill the rightmax array, where rightmax[i] = Math.max(rightmax[i+1], height[i]).
5. For each index i, calculate the water trapped at that position as Math.min(leftmax[i], rightmax[i]) - height[i].
6. Sum up the water trapped at all positions to get the total water trapped.
*/

public class TrappingRainWater {

    static class Solution {
        public int trap(int[] height) {
          int n = height.length;
            if(n==0) return 0;

            int leftmax[] = new int[n];
            int rightmax[] = new int[n];
            leftmax[0] = height[0];
            rightmax[n-1]=height[n-1];

        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }

        for(int i=n-2;i>=0;i--){
	        rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }

        int totalwater = 0;
        for(int i=0;i<n;i++){
	    totalwater+=Math.min(leftmax[i],rightmax[i])-height[i];
        }

        return totalwater;          
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] test1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] test2 = {4, 2, 0, 3, 2, 5};
        int[] test3 = {};
        int[] test4 = {3, 3, 3};

        System.out.println(sol.trap(test1)); 
        System.out.println(sol.trap(test2));
        System.out.println(sol.trap(test3)); 
        System.out.println(sol.trap(test4)); 
    }
}
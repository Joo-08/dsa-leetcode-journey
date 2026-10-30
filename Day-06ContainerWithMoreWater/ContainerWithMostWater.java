/* Arrays : 6
Question : Container With Most Water(11)
Description : 
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Difficulty : Medium
Solution :
*/
public class ContainerWithMostWater {

    // Your solution
    static class Solution {
        public int maxArea(int[] height) {
            int n = height.length;
            int left = 0;
            int right = n-1;
            int maxArea = 0;

            while (left<right) { 
                int width = right-left;
                int minH = Math.min(height[left],height[right]);
                maxArea = Math.max(maxArea,width*minH); 

                if (height[left]<height[right]) {
                    left++;
                }
                else{
                    right--;
                }
            }
            return maxArea;

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] test1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] test2 = {1, 1};

        System.out.println(sol.maxArea(test1)); // expected 49
        System.out.println(sol.maxArea(test2)); // expected 1
    }
}
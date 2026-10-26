/* Arrays : 4
Question : Longest Consecutive Sequence 
Description : 
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:
Input: nums = [1,0,1,2]
Output: 3
 
Solution :

*/
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest=0;
        for(int n:nums) set.add(n);
        for(int n : set){
            if(!set.contains(n-1)){
                int current=n;
                int length=1;
                while(set.contains(current+1)) { 
                    current++;
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
    return longest;
    }
}

public class LongestConsecutiveSequence{
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] a = {100, 4, 200, 1, 3, 2};
        int[] b = {1, 2, 5, 8, 3, 6, 4, 7};
        int[] c = {1, 2, 8, 3, 6, 4, 7, 9};
        int[] d = {0, 1, 2, 5};
        int[] e = {};

        System.out.println(sol.longestConsecutive(a)); // 4
        System.out.println(sol.longestConsecutive(b)); // 8
        System.out.println(sol.longestConsecutive(c)); // 4
        System.out.println(sol.longestConsecutive(d)); // 3
        System.out.println(sol.longestConsecutive(e)); // 0
    }
}
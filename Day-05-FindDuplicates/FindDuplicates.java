import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0) 
                al.add(Math.abs(nums[i]));
            else 
                nums[index]=-nums[index];
        }
        return al;
    }
}

public class FindDuplicates {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(sol.findDuplicates(nums1));   // [2, 3]

        int[] nums2 = {1, 1, 2};
        System.out.println(sol.findDuplicates(nums2));   // [1]

        int[] nums3 = {1};
        System.out.println(sol.findDuplicates(nums3));   // []
    }
}
/* Arrays : 2
Question : Group Anagrams 49
Description : 
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:
Input: strs = [""]
Output: [[""]]
Example 3:
Input: strs = ["a"]
Output: [["a"]]
Difficulty : Medium

Solution :

*/

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch); //get the signature of the incoming string
            if(!hs.containsKey(key)){
                hs.put(key,new ArrayList<>());   //if not already present create a new entry in HashMap
            }
            hs.get(key).add(strs[i]); //If Present add the string to the corresponding key entry of hashmap
        }
        return new ArrayList<>(hs.values());
    }
}

public class GroupAnagram {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};

        System.out.println(sol.groupAnagrams(strs1));
        System.out.println(sol.groupAnagrams(strs2));
        System.out.println(sol.groupAnagrams(strs3));
    }
}

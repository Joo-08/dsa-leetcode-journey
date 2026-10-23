/* Arrays : 3
Question : Valid Anagrams 242
Description : 
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
Difficulty : Easy
Solution :

*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        int count[] = new int[128];
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++; //incrementing
            count[t.charAt(i)-'a']--; //decrementing
        }
        
        for(int i : count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isAnagram("anagram", "nagaram")); 
        System.out.println(sol.isAnagram("rat", "car"));         
        System.out.println(sol.isAnagram("a", "ab"));            
        System.out.println(sol.isAnagram("", ""));               
    }
}
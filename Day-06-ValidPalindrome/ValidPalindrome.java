/* Arrays : 7
Question : Valid Palindrome(125)
Description : 
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Difficulty : Easy
Solution :
*/
public class ValidPalindrome {


    static class Solution {
        public boolean isPalindrome(String s) {
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    s1 += Character.toLowerCase(ch);
                }
            }
            for (int i = s1.length() - 1; i >= 0; i--) {
                char ch = s1.charAt(i);
                s2 += Character.toLowerCase(ch);
            }
            return s1.equals(s2);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car"));                     // false
        System.out.println(sol.isPalindrome(" "));                              // true
    }
}
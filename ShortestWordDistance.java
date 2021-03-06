// Time Complexity : O(n) --> where n is the length of input words arrays
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (243): Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int i1 = -1; int i2 = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (word1.equals(words[i])) i1 = i;
            if (word2.equals(words[i])) i2 = i;
            if (i1 != -1 && i2 != -1) min = Math.min(min, Math.abs(i1 - i2));
        }
        return min;
    }
}
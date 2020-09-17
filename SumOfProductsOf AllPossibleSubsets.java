// Time Complexity : O(n) --> where n is given in input
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int productOfSubsetSums(int arr[], int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
			ans *= (1 + arr[i])
        }
        return ans - 1;
    }
}
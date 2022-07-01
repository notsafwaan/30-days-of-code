// https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] Shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int i = 0;
        int j = n;
        int curr = 0;
        while (i < n) {
            res[curr] = nums[i];
            curr++;
            i++;
            res[curr] = nums[j];
            curr++;
            j++;
        }
        return res;
    }
}

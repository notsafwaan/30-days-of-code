// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class FindEvenNumbers{
    public int findNumbers(int[] nums) {
        int evens = 0;
        for (int i=0; i<nums.length; i++) {
            int digits = 0, num = nums[i];
            while (num!=0) {
                num /= 10;
                ++digits;
            }
            if (digits%2==0) evens++;
        }
        return evens;
    }
}

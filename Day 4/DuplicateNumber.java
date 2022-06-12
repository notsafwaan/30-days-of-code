// https://leetcode.com/problems/find-the-duplicate-number/

class DuplicateNumber {
    void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) swap(nums, i, correctIndex);
            else i++;
        }
        for (int idx = 0; idx < nums.length; idx++) {
            if(nums[idx] != idx + 1) return nums[idx];
        }
        return  -1;
    }
}

// https://leetcode.com/problems/missing-number/

class MissingNumber {
    static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] == nums.length) i++;
            else if(nums[i] != nums[correctIndex]){
                swap(nums, i, nums[i]);
            } else i++;
        }
    for (int idx = 0; idx < nums.length; idx++) {
        if (idx != nums[idx]){
            return idx;
        };
    }
    return nums.length;
    }
}

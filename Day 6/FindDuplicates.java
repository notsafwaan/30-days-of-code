// https://leetcode.com/problems/find-all-duplicates-in-an-array/
class FindDuplicates {
  void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) swap(nums, i, correctIndex);
            else i++;
        }
        List<Integer> res = new ArrayList<>();
        for (int idx = 0; idx < nums.length ; idx++) {
            if(nums[idx] != idx + 1){
                int elemIdx = nums[idx] - 1;
                if(nums[idx] == nums[elemIdx]) res.add(nums[idx]);
            }
        }
        return  res;
    }
}

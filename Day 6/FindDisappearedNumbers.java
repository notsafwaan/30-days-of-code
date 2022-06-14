// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
class FindDisappearedNumbers {
        static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // correctIndex variable tells the correct index for the value arr[i]
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
            System.out.println(Arrays.toString(nums));
            List<Integer> disappearedNumbers = new ArrayList<>();
            for (int idx = 0; idx < nums.length; idx++) {
                if (nums[idx] != idx + 1) disappearedNumbers.add(idx + 1);
            }
            return disappearedNumbers;
        }
}

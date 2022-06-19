// https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class ArrayIntersectionII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i ++){
            if (!data.containsKey(nums1[i])) {
                data.put(nums1[i], 1);
            }
            else {
                data.put(nums1[i], data.get(nums1[i]) + 1);
            }
        }
        List<Integer> res = new LinkedList<Integer>();
        for (int i = 0; i < nums2.length; i ++) {
            if (data.containsKey(nums2[i]) && data.get(nums2[i]) != 0) {
                res.add(nums2[i]);
                data.put(nums2[i], data.get(nums2[i]) - 1);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for (Integer j:res) {
            result[i++] = j;
        }
        return result;
    }
}

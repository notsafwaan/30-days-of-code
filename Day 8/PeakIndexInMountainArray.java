// https://leetcode.com/problems/peak-index-in-a-mountain-array/
class peakIndex {
  public static int getPeakIndex(int[] array) {
    int low = 0;
    int high = array.length - 1;
    int mid;
    while (low<high) {
      mid = low + (high - low) / 2;
      if (array[mid] >= array[mid + 1]) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

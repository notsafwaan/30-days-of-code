// https://leetcode.com/problems/check-if-n-and-its-double-exist/
import java.util.Arrays;
import java.util.Set ;
import java.util.HashSet;
public class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();   
        for (int i : arr) {
            if (seen.contains(2 * i) || (i % 2 == 0 && seen.contains(i / 2)))
                return true;
            seen.add(i);
        }
        return false;
    }

package arrays.problem220;

/*You are given an integer array nums and two integers indexDiff and valueDiff.

Find a pair of indices (i, j) such that:

i != j,
abs(i - j) <= indexDiff.
abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise.*/

import java.util.HashSet;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > indexDiff) {
                set.remove(nums[i - indexDiff - 1]);
                for (var num1 : set) {
                    for (var num2 : set){
                    }
                }
            }

            set.add(nums[i]);

        }
        return false;
    }
}

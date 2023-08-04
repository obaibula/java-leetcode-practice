package problem217;

import java.util.HashSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for(var num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}

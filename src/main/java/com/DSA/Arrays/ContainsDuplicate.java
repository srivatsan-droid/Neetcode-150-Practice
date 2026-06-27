package com.DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /*
    Optimized Approach :
    TC : O(n)
    Use a Set Since With Set we will be Evaluating only the Unique Elements
    Once Set contains the Number in it then Return False Else Return true and add the Number to the Set
    Once a Number is Added to the Set there is no Duplication Allowed
     */
    public static boolean isDuplicate(int nums[]) {
        Set<Integer> uniqueElements = new HashSet<>();
        for(int num : nums) {
            if(uniqueElements.contains(num)) {
                return true;
            }
            uniqueElements.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        boolean ans = isDuplicate(nums);
        System.out.println(ans);
    }
}

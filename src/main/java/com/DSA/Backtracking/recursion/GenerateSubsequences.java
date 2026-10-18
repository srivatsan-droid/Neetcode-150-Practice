package com.DSA.Backtracking.recursion;

import java.util.*;
public class GenerateSubsequences {
    static void findSubsequences(int curr, int[] arr,
                                 List<Integer> subarr,
                                 List<List<Integer> > res) {

        // Base case: When we reach the end of the array,
        // add the current subsequence to the result
        if (curr == arr.length) {
            res.add(new ArrayList<>(
                    subarr));

            return;
        }

        // Include the current element in
        // the subsequence
        subarr.add(arr[curr]);

        // Recurse to the next element
        findSubsequences(
                curr + 1, arr, subarr,
                res);

        // Backtrack: Remove the current element and explore
        // the next possibility
        subarr.remove(subarr.size() - 1);

        //  Do not include the current
        // element in the subsequence
        findSubsequences(
                curr + 1, arr, subarr,
                res);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        List<Integer> subarr = new ArrayList<>();

        List<List<Integer> > res = new ArrayList<>();

        findSubsequences(0, arr, subarr, res);


        for (List<Integer> subsequence : res) {
            for (int num : subsequence) {
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}

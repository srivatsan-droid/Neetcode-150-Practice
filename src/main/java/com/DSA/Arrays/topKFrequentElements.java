package com.DSA.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentElements {
    public static int[] topKFrequent(int nums[],int k) {
        int result[] = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            queue.add(new int[]{entry.getKey(),entry.getValue()});
            if(queue.size() > k) {
                queue.poll();
            }
        }
        for(int i = 0;i < k;i++) {
            result[i] = queue.poll()[0];
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        int ans[] = topKFrequent(nums,k);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}

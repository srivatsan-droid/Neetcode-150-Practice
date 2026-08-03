package com.DSA.Revision.Arrays;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char convert[] = strs[i].toCharArray();
            Arrays.sort(convert);
            String key = new String(convert);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}

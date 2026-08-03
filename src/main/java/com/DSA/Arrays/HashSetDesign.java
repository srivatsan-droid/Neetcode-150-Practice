package com.DSA.Arrays;
import java.util.*;

class MyHashSet {
    Set<Integer> set;
    public MyHashSet() {
        set = new HashSet<>();
    }
    public void add(int key) {
        set.add(key);
    }
    public void remove(int key) {
        set.remove(key);
    }
    public boolean contains(int key) {
        return set.contains(key);
    }
}
public class HashSetDesign {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(122);
        obj.add(120);
        obj.remove(120);
        boolean ans  = obj.contains(120);
        System.out.println(ans);
    }
}

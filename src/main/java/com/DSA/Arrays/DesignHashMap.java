package com.DSA.Arrays;
import java.util.*;
class MyHashMap {
    HashMap<Integer,Integer> map;
    public MyHashMap() {
        map = new HashMap<>();
    }

    public void put(int key, int value) {
        map.put(key,value);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void remove(int key) {
        map.remove(key);
    }
}
public class DesignHashMap {
    public static void main(String[] args) {

        MyHashMap obj = new MyHashMap();

        // Put key-value pairs
        obj.put(1, 10);
        obj.put(2, 20);

        // Get values
        System.out.println("Key 1: " + obj.get(1)); // 10
        System.out.println("Key 2: " + obj.get(2)); // 20
        System.out.println("Key 3: " + obj.get(3)); // -1

        // Update existing key
        obj.put(2, 50);
        System.out.println("Updated Key 2: " + obj.get(2)); // 50

        // Remove a key
        obj.remove(2);
        System.out.println("After removal Key 2: " + obj.get(2)); // -1
    }
}

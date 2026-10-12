package com.DSA.LinkedList;

import java.util.*;

class Node1 {
    int key;
    int value;
    Node1 prev;
    Node1 next;

    Node1(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    HashMap<Integer, Node1> map;
    Node1 head;
    Node1 tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        map = new HashMap<>();

        head = new Node1(0, 0);
        tail = new Node1(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    // Add node just before tail
    private void addNode(Node1 node) {

        Node1 previous = tail.prev;

        previous.next = node;
        node.prev = previous;

        node.next = tail;
        tail.prev = node;
    }

    // Remove a node from the linked list
    private void removeNode(Node1 node) {

        Node1 previous = node.prev;
        Node1 next = node.next;

        previous.next = next;
        next.prev = previous;
    }

    public int get(int key) {

        // Key doesn't exist
        if (!map.containsKey(key)) {
            return -1;
        }

        // Get the node from HashMap
        Node1 node = map.get(key);

        // Move it to most recently used position
        removeNode(node);
        addNode(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Key already exists
        if (map.containsKey(key)) {

            Node1 node = map.get(key);

            // Update value
            node.value = value;

            // Move to MRU
            removeNode(node);
            addNode(node);

            return;
        }

        // Key doesn't exist, create new node
        Node1 node = new Node1(key, value);

        // Add to HashMap
        map.put(key, node);

        // Add to MRU position
        addNode(node);

        // Capacity exceeded
        if (map.size() > capacity) {

            // First node after head is LRU
            Node1 lru = head.next;

            // Remove from linked list
            removeNode(lru);

            // Remove from HashMap
            map.remove(lru.key);
        }
    }
}

public class LRUCacheMain {

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        System.out.println(cache.get(1));

        cache.put(3, 3);

        System.out.println(cache.get(2));

        cache.put(4, 4);

        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
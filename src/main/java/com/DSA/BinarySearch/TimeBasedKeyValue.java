package com.DSA.BinarySearch;

import java.util.*;

class Data {
    String val;
    int time;

    Data(String val, int time) {
        this.val = val;
        this.time = time;
    }
}

class TimeMap {

    Map<String, List<Data>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(new Data(value, timestamp));
    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key)) {
            return "";
        }

        List<Data> list = map.get(key);

        int low = 0;
        int high = list.size() - 1;

        String answer = "";

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (list.get(mid).time <= timestamp) {
                answer = list.get(mid).val;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }
}

public class TimeBasedKeyValue {

    public static void main(String[] args) {

        TimeMap timeMap = new TimeMap();

        timeMap.set("foo", "bar", 1);

        System.out.println(timeMap.get("foo", 1)); // bar
        System.out.println(timeMap.get("foo", 3)); // bar

        timeMap.set("foo", "bar2", 4);

        System.out.println(timeMap.get("foo", 4)); // bar2
        System.out.println(timeMap.get("foo", 5)); // bar2
    }
}
package com.DSA.Greedy;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas < totalCost) {
            return -1;
        }

        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        int ans = canCompleteCircuit(gas,cost);
        System.out.println(ans);
    }
}

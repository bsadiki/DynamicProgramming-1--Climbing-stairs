package com.xmart.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println(possiblities(4));
    }
    static int possiblities(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int solutions[] = new int[n];
        solutions[0] = 1;
        solutions[1] = 2;
        for (int i = 2; i < n; i++) {
            solutions[i] = solutions[i-1] + solutions[i-2];
        }
        return solutions[n-1];
    }
}

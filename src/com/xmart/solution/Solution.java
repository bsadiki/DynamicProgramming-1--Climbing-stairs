package com.xmart.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println(possiblities(5));
    }
    static int possiblities(int n){
        if(n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return possiblities(n-1) + possiblities(n-2);
    }
}

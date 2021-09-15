package com.example.lab1helloworld;

public class Myclass {
    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int Maximum(int a, int b) {
        int max = 0;
        if(a > b) max = a;
        else max = b;
        return max;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int Minimum(int a, int b) {
        int min = 0;
        if(a < b) min = a;
        else min = b;
        return min;
    }
}

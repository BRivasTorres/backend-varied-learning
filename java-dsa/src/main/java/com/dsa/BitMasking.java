package com.dsa;

public class BitMasking {
    public static void main(String[] args) {
        int n = 36;
        int i = 3;

        int onMask = 1 << i;

        System.out.println(n | onMask);
    }
}

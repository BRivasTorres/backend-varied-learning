package com.dsa;

public class PrimeFactors {
    static int primeFactors(int n) {
        int i = 2;
        while(i*i <= n) {
            while (n%i == 0) {
                System.out.println(i);
                n = n/i;
            }
            i++;
        }

        if(n > 1) {
            System.out.prinln(n);
        }
        return i;
    }

    public static void main(String[] args) {

    }
}
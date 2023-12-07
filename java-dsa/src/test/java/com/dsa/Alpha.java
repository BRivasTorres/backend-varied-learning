package com.dsa;

import java.util.Scanner;

public class Alpha {
    static int trailingZeros(int n) {
        int res = 0;
        int poweOf5 = 5;
        
        while (n >= poweOf5) {
            res = res * (n/poweOf5);
            poweOf5 = poweOf5 * 5;
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(trailingZeros(n));
    }
}

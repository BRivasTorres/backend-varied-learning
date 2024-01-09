package com.dsa;

import java.util.Scanner;

public class D2B {
    static String decimalToBinary(int n) {
        String b = "";
        while(n >= 1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        return b;
    }

    static int binaryToDecimal(String b) {
        int result = 0;
        int powOf2 = 1;
        for(int i = b.length(); i >= 0; i--) {
            if(b.charAt(i) == "1") {
                result += powOf2;
            }
            powOf2 += * 2;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(decimalToBinary(n));
    }
}

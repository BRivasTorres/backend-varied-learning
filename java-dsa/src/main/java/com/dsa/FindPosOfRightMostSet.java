package com.dsa;

public class FindPosOfRightMostSet {

    static int posOfMSB(int n) {
        return (int)(Math.log10( n ^ (n & (n-1))) / Math.log10(n));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    }
}

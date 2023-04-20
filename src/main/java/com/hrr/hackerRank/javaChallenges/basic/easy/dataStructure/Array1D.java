package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.util.Scanner;

public class Array1D {
//    https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            // if (i < n-1) sc.nextLine();
        }
        sc.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

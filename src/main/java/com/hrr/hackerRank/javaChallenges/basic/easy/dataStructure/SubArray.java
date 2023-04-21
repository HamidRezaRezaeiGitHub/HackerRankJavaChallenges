package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.util.Scanner;

public class SubArray {
//    https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int negativeCount = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            arr[i] = sc.nextInt();
            for (int j = i; j >= 0; j--) {
                sum += arr[j];
                if (sum < 0) {
                    negativeCount++;
                }
            }
        }
        System.out.println(negativeCount);
    }

}

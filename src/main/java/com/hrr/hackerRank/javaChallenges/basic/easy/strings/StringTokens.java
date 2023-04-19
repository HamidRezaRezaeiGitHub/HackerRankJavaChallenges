package com.hrr.hackerRank.javaChallenges.basic.easy.strings;

import java.util.Scanner;

public class StringTokens {
//    https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        if (line.isBlank()) {
            System.out.println("0");
        } else {
            String[] arr = line.split("[ !,?._'@]+");
            System.out.println(arr.length);
            for (String str : arr) {
                System.out.println(str);
            }
        }
        sc.close();
    }
}

package com.hrr.hackerRank.javaChallenges.basic.easy.strings;

import java.util.Scanner;

public class StringReverse {
    //    https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String isIt = "Yes";
        for (int i = 0; i < A.length(); i++) {
            int half = A.length() % 2 == 0 ? A.length() / 2 : (A.length() - 1) / 2;
            if (i >= half) {
                break;
            }
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                isIt = "No";
                break;
            }
        }

        System.out.println(isIt);
    }
}

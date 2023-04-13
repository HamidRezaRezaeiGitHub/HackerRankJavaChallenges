package com.hrr.hackerRank.javaChallenges.basic.easy.strings;

import java.util.Scanner;

public class SubstringComparison {
//    https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i=0; i<s.length()-k+1; i++) {
            String sub = s.substring(i, i+k);
            smallest = smallest.compareTo(sub) > 0 ? sub : smallest;
            largest = largest.compareTo(sub) > 0 ? largest : sub;
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

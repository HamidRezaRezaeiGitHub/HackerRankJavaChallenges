package com.hrr.hackerRank.javaChallenges.basic.easy.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntax {
//    https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String patternStr = sc.nextLine();
            try {
                Pattern.compile(patternStr);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }

}

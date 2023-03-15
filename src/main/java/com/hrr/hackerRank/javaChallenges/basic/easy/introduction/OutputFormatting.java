package com.hrr.hackerRank.javaChallenges.basic.easy.introduction;

import java.io.InputStream;
import java.util.Scanner;

public class OutputFormatting {
    //    https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = OutputFormatting.class.getClassLoader().getResourceAsStream("OutputFormatting.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }

//    Oracle formatting document:
//    https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Formatter.html#syntax
}

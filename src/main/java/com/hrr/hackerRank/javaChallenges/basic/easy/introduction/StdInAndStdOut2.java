package com.hrr.hackerRank.javaChallenges.basic.easy.introduction;

import java.io.InputStream;
import java.util.Scanner;

public class StdInAndStdOut2 {
//    https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = StdInAndStdOut.class.getClassLoader().getResourceAsStream("StdInAndStdOut2.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        sc.close();
    }

}

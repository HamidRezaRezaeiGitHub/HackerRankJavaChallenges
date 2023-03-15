package com.hrr.hackerRank.javaChallenges.basic.easy.introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
    //    https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
    static Scanner scanner = new Scanner(System.in);
    static int b = scanner.nextInt();
    static int h = scanner.nextInt();

    static {
        try {
            if (b <= 0 || h <= 0) {
                throw new Exception("Breadth and height must be positive");
            } else {
                System.out.println(b * h);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

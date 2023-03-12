package com.hrr.hackerRank.javaChallenges.basic.easy.introduction;

import java.io.InputStream;
import java.util.Scanner;

public class StdInAndStdOut {
//    https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = StdInAndStdOut.class.getClassLoader().getResourceAsStream("StdInAndStdOut.txt");
        Scanner scanner = new Scanner(is);
//        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println(scanner.nextInt());
        }
        scanner.close();
    }

}

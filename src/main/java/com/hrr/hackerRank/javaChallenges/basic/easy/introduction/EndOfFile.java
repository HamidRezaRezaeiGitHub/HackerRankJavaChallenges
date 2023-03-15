package com.hrr.hackerRank.javaChallenges.basic.easy.introduction;

import java.io.InputStream;
import java.util.Scanner;

public class EndOfFile {
//    https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = EndOfFile.class.getClassLoader().getResourceAsStream("EndOfFile.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (sc.hasNext()){
            System.out.println(++n + " " + sc.nextLine());
        }
    }

}

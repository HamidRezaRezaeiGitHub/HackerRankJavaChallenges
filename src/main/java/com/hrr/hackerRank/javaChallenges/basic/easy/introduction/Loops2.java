package com.hrr.hackerRank.javaChallenges.basic.easy.introduction;

import java.io.InputStream;
import java.util.Scanner;

public class Loops2 {
//    https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = Loops2.class.getClassLoader().getResourceAsStream("Loops2.txt");
        Scanner in = new Scanner(is);
//        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int last = a + (int) Math.pow(2,0)*b;
            System.out.print(last + " ");
            for (int j=1; j< n; j++) {
                last += Math.pow(2,j)*b;
                System.out.print(last + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

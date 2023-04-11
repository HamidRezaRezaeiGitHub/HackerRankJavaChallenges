package com.hrr.hackerRank.javaChallenges.basic.easy.strings;

import java.util.Scanner;

public class StringIntro {
//    https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());

        // Manual comparison
        // boolean flag = false;
        // for(int i=0; i< A.length(); i++) {
        //     if (i == B.length()) {
        //         System.out.println("Yes");
        //         flag = true;
        //         break;
        //     }
        //     if ((int)A.charAt(i) < (int)B.charAt(i)) {
        //         System.out.println("No");
        //         flag = true;
        //         break;
        //     } else if ((int)A.charAt(i) > (int)B.charAt(i)) {
        //         System.out.println("Yes");
        //         flag = true;break;

        //     }
        // }
        // if (!flag) {
        //     System.out.println("No");
        // }

        // Java Comparison
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.print(String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1) + " ");
        System.out.print(String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1));

    }

}

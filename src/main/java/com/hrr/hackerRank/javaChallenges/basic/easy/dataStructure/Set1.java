package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set1 {
//    https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextLine());
            System.out.println(set.size());
        }
        sc.close();
    }

}

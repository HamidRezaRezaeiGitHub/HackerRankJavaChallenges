package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
//    https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = List1.class.getClassLoader().getResourceAsStream("List1.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String ops = sc.nextLine().trim();
            if ("Insert".equalsIgnoreCase(ops)) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if ("Delete".equalsIgnoreCase(ops)) {
                int index = sc.nextInt();
                list.remove(index);
            }
            if (sc.hasNextLine()) sc.nextLine();
        }
        sc.close();
        System.out.println(list.toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", ""));

    }

}

package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
//    https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = ArrayList1.class.getClassLoader().getResourceAsStream("ArrayList1.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] arr = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                arrayList.add(sc.nextInt());
            }
            arr[i] = arrayList;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y <= arr[x - 1].size()) {
                System.out.println(arr[x - 1].get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}

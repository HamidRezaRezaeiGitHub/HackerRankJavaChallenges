package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.io.InputStream;
import java.util.BitSet;
import java.util.Scanner;

public class BitSet1 {
//    https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = BitSet1.class.getClassLoader().getResourceAsStream("BitSet1.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m > 0) sc.nextLine();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for (int i = 0; i < m; i++) {
            String[] line = sc.nextLine().trim().split(" ");
            String ops = line[0];
            int setNo = Integer.valueOf(line[1]);
            BitSet leftBitSet = (setNo == 1) ? b1 : b2;
            int setOrIndexNo = Integer.valueOf(line[2]);

            if ("AND".equals(ops)) {
                BitSet rightBitSet = (setOrIndexNo == 1) ? b1 : b2;
                leftBitSet.and(rightBitSet);
            } else if ("OR".equals(ops)) {
                BitSet rightBitSet = (setOrIndexNo == 1) ? b1 : b2;
                leftBitSet.or(rightBitSet);
            } else if ("XOR".equals(ops)) {
                BitSet rightBitSet = (setOrIndexNo == 1) ? b1 : b2;
                leftBitSet.xor(rightBitSet);
            } else if ("FLIP".equals(ops)) {
                leftBitSet.flip(setOrIndexNo);
            } else if ("SET".equals(ops)) {
                leftBitSet.set(setOrIndexNo);
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        sc.close();
    }

}

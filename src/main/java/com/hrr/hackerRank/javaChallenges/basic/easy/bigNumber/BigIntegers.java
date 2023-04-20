package com.hrr.hackerRank.javaChallenges.basic.easy.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegers {
//    https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine().trim());
        BigInteger b = new BigInteger(sc.nextLine().trim());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

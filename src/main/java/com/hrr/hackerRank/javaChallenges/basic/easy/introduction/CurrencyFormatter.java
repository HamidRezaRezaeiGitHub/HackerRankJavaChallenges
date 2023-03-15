package com.hrr.hackerRank.javaChallenges.basic.easy.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    //    https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

        String india = NumberFormat.getCurrencyInstance(new Locale("en")).format(payment);
        india = "Rs." + india.substring(1);

        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}

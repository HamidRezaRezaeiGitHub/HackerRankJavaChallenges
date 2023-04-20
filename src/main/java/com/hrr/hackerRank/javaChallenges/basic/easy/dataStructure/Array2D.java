package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.io.InputStream;
import java.util.Scanner;

public class Array2D {
//    https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true

    public static void main(String[] args) {
        InputStream is = Array2D.class.getClassLoader().getResourceAsStream("Array2D.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int size = 6;
        int[][] arr = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        sc.close();

        int max = 0;
        for (int row = 0; row < size - 2; row++) {
            for (int col = 0; col < size - 2; col++) {
                int sum = 0;
                sum += arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
                sum += arr[row + 1][col + 1];
                sum += arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
                if (row == 0 && col == 0) max = sum;
                max = sum > max ? sum : max;
            }
        }
        System.out.println(max);
    }

}

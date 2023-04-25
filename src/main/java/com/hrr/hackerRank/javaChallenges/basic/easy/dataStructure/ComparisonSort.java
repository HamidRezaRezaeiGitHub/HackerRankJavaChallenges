package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparisonSort {
//    https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = ComparisonSort.class.getClassLoader().getResourceAsStream("ComparisonSort.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<StudentInfo> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] infoLine = sc.nextLine().trim().split(" ");
            int id = Integer.valueOf(infoLine[0]);
            String name = infoLine[1];
            float cgpa = Float.valueOf(infoLine[2]);
            list.add(new StudentInfo(id, name, cgpa));
        }
        Collections.sort(list);
        for (StudentInfo studentInfo : list) {
            System.out.println(studentInfo.name);
        }
        sc.close();
    }
}

class StudentInfo implements Comparable<StudentInfo> {
    int id;
    String name;
    float cgpa;

    StudentInfo(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(StudentInfo other) {
        if (this.cgpa != other.cgpa) {
            return this.cgpa > other.cgpa ? -1 : 1;
        } else {
            if (!this.name.equals(other.name)) {
                return this.name.compareTo(other.name);
            } else {
                return (int) this.id - other.id;
            }
        }
    }
}
package com.hrr.hackerRank.javaChallenges.basic.easy.dataStructure;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map1 {
    //    https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStream is = Map1.class.getClassLoader().getResourceAsStream("Map1.txt");
        Scanner sc = new Scanner(is);
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, String> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            phoneBook.put(sc.nextLine(), sc.nextLine());
        }
        while (sc.hasNextLine()) {
            String name = sc.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }

}

package com.hrr.hackerRank.javaChallenges.basic.easy.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
//    https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String firstStr = nextStr(sc);
        Map<Character, Integer> firstMap = getCharMapOfString(firstStr);

        String secondStr = nextStr(sc);
        Map<Character, Integer> secondMap = getCharMapOfString(secondStr);

        if (firstMap.equals(secondMap)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    private static String nextStr(Scanner sc) {
        return sc.nextLine().trim().toLowerCase();
    }

    private static Map<Character, Integer> getCharMapOfString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        return map;
    }
}

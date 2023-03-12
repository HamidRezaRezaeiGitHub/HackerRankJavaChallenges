package com.hrr.hackerRank.javaChallenges.inputs;

import java.io.InputStream;

public class FileLoader {
    public static InputStream readInputStream(String fileName) {
        return FileLoader.class.getClassLoader().getResourceAsStream(fileName);
    }
}

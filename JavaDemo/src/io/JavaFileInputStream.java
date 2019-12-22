package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class JavaFileInputStream {
    public void readFile() throws IOException {
        try (Reader reader = new FileReader("src/readme.txt", StandardCharsets.UTF_8)) {
            char[] buffer = new char[100];
            int n;
            while ((n = reader.read(buffer)) != -1) {
                System.out.println("read " + n + " chars.");
                System.out.println(buffer[18]);
            }
        }
    }

    public static void main(String[] args) {
        var javaFileInputStream = new JavaFileInputStream();
        try {
            javaFileInputStream.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

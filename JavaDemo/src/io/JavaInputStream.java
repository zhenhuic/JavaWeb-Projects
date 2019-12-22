package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class JavaInputStream {
    public void readFile() throws IOException {
        try (InputStream inputStream = new FileInputStream("src/readme.txt")) {
            // 定义1000个字节大小的缓冲区
            byte[] buffer = new byte[100];
            int n = 0;
            while ((n = inputStream.read(buffer)) != -1) {
                System.out.println("read " + n + " bytes.");
                System.out.println(Arrays.toString(buffer));
                for (int i = 0; i < n; i++) {
                    char ch = (char) buffer[i];
                    System.out.println(ch);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        var javaInputStream = new JavaInputStream();
        try {
            javaInputStream.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

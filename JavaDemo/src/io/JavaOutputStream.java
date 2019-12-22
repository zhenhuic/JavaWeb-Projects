package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class JavaOutputStream {
    public void writeFile() throws IOException {
        OutputStream output = new FileOutputStream("out/temp.txt");
        output.write("Hello".getBytes(StandardCharsets.UTF_8)); // Hello
        output.close();
    }

    public static void main(String[] args) {
        var javaOutputStream = new JavaOutputStream();
        System.out.println(Arrays.toString("Hello".getBytes(StandardCharsets.UTF_8)));
    }
}

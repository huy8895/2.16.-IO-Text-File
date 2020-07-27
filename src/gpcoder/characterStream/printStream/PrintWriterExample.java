package gpcoder.characterStream.printStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("trinh van huy xin chao!");
        writer.close();

        PrintWriter writer1 = new PrintWriter(new FileWriter("data/test.txt"));
        writer1.write("hello world!");
        writer1.close();

    }
}

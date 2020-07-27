package gpcoder.characterStream.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("data/test.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("hi");
        bufferedWriter.write("hi");
        bufferedWriter.write("hi");
        bufferedWriter.write("hi");
        bufferedWriter.close();
    }
}

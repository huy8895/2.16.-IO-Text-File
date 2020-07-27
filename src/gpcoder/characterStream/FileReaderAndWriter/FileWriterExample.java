package gpcoder.characterStream.FileReaderAndWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("data/test.txt");
            fileWriter.write("huy8895 xin chao");
            fileWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

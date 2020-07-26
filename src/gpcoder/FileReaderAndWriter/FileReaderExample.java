package gpcoder.FileReaderAndWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("data/test.txt");
        int i;
        while ((i = fileReader.read()) != -1){
            System.out.print((char) i);
        }
        fileReader.close();
    }
}

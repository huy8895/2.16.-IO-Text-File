package gpcoder.characterStream.Buffered;

import gpcoder.characterStream.FileReaderAndWriter.FileReaderExample;

import java.io.*;

public class BufferdReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("data/test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String s;
        while ((s = bufferedReader.readLine()) != null){
            System.out.println(s);
        }
    }
}

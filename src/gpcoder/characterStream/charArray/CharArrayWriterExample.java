package gpcoder.characterStream.charArray;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterExample {
    public static void main(String[] args) throws IOException {
        CharArrayWriter out = new CharArrayWriter();
        out.write("trinhvanhuy");
        FileWriter fileWriter1 = new FileWriter("data/test1.txt");
        FileWriter fileWriter2 = new FileWriter("data/test2.txt");
        FileWriter fileWriter3 = new FileWriter("data/test3.txt");
        FileWriter fileWriter4 = new FileWriter("data/test4.txt");

        out.writeTo(fileWriter1);
        out.writeTo(fileWriter2);
        out.writeTo(fileWriter3);
        out.writeTo(fileWriter4);
        fileWriter1.close();
        fileWriter2.close();
        fileWriter3.close();
        fileWriter4.close();
    }
}

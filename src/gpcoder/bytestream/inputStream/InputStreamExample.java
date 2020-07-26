package gpcoder.bytestream.inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        // doc noi dung cua file su dung fileInputStream
        InputStream iS = new FileInputStream("data/test.txt");
        int i;
        i = iS.read();//moi lan read no se doc 1 byte
        while (i != -1){
            System.out.println((char) i);
            i = iS.read();
        }
    }
}

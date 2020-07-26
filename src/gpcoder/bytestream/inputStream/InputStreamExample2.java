package gpcoder.bytestream.inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {
        // doc nhieu byte cung 1 luc su dung fileInputStream
        InputStream is = new FileInputStream("data/test.txt");
        byte[] bytes = new byte[10];
        int i = -1;

        while ((i=is.read(bytes) )!= -1){
            String str = new String(bytes,0,i);
            System.out.println(str);
        }
        is.close();

    }
}

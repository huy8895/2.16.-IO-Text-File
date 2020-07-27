package gpcoder.characterStream.luongnhiphansangluongkytu;

import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        //tao 1 luong byteStream de doc file
        InputStream in = new FileInputStream("data/test.txt");

        //tao 1 characterStream voi ma hoa encoding
        Reader reader = new InputStreamReader(in, "UTF-8");

        int i = 0;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }
        reader.close();

    }
}

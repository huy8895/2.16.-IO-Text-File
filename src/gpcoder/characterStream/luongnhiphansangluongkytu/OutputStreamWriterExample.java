package gpcoder.characterStream.luongnhiphansangluongkytu;

import java.io.*;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws IOException {
        //tao 1 outputStream luong dau ra de ghi du lieu vao file
        OutputStream out = new FileOutputStream("data/test.text");
        //tao 1 characterStream voi ma hoa encoding.
        Writer writer = new OutputStreamWriter(out,"UTF-8");

        String s = "toi la trinh van huy";
        writer.write(s);
        writer.close();


    }
}

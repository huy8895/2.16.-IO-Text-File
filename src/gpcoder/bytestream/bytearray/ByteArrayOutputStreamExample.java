package gpcoder.bytestream.bytearray;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fous = new FileOutputStream("data/test1.txt");
        FileOutputStream fous2 = new FileOutputStream("data/test2.txt");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write((new byte[] {'h','e','e','e','e','e',}));
        baos.writeTo(fous);
        baos.writeTo(fous2);
        baos.flush();
        baos.close();

    }
}

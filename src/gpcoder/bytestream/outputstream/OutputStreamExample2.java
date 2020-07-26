package gpcoder.bytestream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample2 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("data/test.txt");

        byte[] b1 = new byte[]{'t','r','i','n','h'};
        byte[] b2 = new byte[]{'v','a','n'};
        byte[] b3 = new byte[]{'h','u','y'};
        byte[] b4 = new byte[]{8,8,9,5};
        byte[] b5 = new byte[]{'I','\'','o'};

        // Ghi cả các byte trong mảng byte[] by vào luồng
        outputStream.write(b1);

        // Đẩy các byte hiện có trên luồng xuống file .
        //outputStream.flush();

        outputStream.write(b2);
        outputStream.write(b3);
        outputStream.write(b4);
        outputStream.write(b5);
        outputStream.close();
    }
}

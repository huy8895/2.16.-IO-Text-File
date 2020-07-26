package gpcoder.bytestream.sequenceInputStream;

import java.io.*;

public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException {
        // su dung SequenceInputStream khi muon doc tu nhieu file
        // va ghi du lieu do vao 1 file
        FileInputStream input1 = null;
        FileInputStream input2 = null;
        SequenceInputStream sis = null;


        try {
            input1 = new FileInputStream("data/test1.txt");
            input2 = new FileInputStream("data/test2.txt");
            sis = new SequenceInputStream(input1,input2);

            FileOutputStream fi = new FileOutputStream("data/test3.txt");
            byte[] bytes = new byte[10];
            int i;
            while ((i = sis.read(bytes)) != -1){
                String str = new String(bytes,0,i);
                fi.write(bytes,0,i);
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sis.close();
            input1.close();
            input2.close();
        }

    }
}

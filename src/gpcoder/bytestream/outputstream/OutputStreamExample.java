package gpcoder.bytestream.outputstream;

import java.io.*;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        // ghi noi dung ra file fileOutputStream

        OutputStream os = new FileOutputStream("data/test.txt");
        byte[] bytes = {'h','e','o','o','o','o'};
        InputStream in = System.in;
        int i ;
        os.write(bytes);
        os.write(bytes);
        os.write(bytes);
        os.write(bytes);
        os.close();
//        while ((i = in.read(bytes)) != -1){
//            String string = new String(bytes,0,i);
//            os.write(bytes,0,i);
//            System.out.println(string);
//        }

    }
}

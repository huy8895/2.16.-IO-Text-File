package gpcoder.bytestream.bytearray;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {

        byte[] bytes = {'h','e','l','l','o'};
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        int k = 0;
        while ((k = bais.read()) != -1){
            System.out.println((char) k);
        }

    }
}

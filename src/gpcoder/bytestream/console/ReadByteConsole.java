package gpcoder.bytestream.console;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        int i = is.read();
        System.out.println(i);

    }
}

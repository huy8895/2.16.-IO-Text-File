package gpcoder.bytestream.filterStream.dataStream;

import java.io.*;

public class dataInputStream {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("data/test.txt");
        DataInputStream dis = new DataInputStream(is);

        int id = dis.readInt();
        String name = dis.readUTF();

        System.out.println("name + id = " + name + " " + id);
        dis.close();
    }
}

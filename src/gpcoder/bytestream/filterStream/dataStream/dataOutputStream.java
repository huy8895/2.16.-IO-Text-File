package gpcoder.bytestream.filterStream.dataStream;

import java.io.*;

public class dataOutputStream {
    public static void main(String[] args) throws IOException {

        //ghi file su DataOutputStream
        // ghi cac kieu du lieu nguyen thuy den file.
        int id =88;
        String name = "huy8895";
        OutputStream file = new FileOutputStream("data/test.txt");
        DataOutputStream dos = new DataOutputStream(file);

        dos.writeInt(id);
        dos.writeUTF(name);
        dos.flush();
        dos.close();
        System.out.println("done...");
    }

}

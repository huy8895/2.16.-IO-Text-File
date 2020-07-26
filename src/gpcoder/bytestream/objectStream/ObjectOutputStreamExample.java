package gpcoder.bytestream.objectStream;

import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        //ObjectOutputStream de ghi doi tuong vao file
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream(new FileOutputStream("data/student.txt"));
        oos.writeObject(new Student(88,"huy",25));
        oos.writeObject(new Student(70,"hoang",21));
        oos.writeObject(new Student(37,"tung",25));
        oos.flush();
        oos.close();
    }
}

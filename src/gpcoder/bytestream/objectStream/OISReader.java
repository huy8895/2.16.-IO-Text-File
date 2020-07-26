package gpcoder.bytestream.objectStream;

import java.io.*;

public class OISReader {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;
                try {
                    ois = new ObjectInputStream(new FileInputStream("data/student.txt"));
                    Student student = null;
                    while ((student = (Student) ois.readObject()) != null)
                        System.out.println(student);

                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
}

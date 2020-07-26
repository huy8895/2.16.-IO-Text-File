package taofilemoi;

import java.io.*;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("hello");
        bufferedWriter.close();
    }
}

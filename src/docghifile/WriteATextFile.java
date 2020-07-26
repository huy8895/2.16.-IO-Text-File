package docghifile;

import java.io.*;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("huytest.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("xin chao");
            bufferedWriter.write("\n");
            bufferedWriter.write("xin chao huy");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

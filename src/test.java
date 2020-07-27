import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("testFileWriter");
        file.mkdirs();


        FileWriter fileWriter = new FileWriter("testFileWriter/test.txt");

        String string = "huy";

        fileWriter.close();

    }
}

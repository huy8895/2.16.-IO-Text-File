import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("folder/country.csv"));

        String string;
        while ((string = fileReader.readLine()) != null){
            System.out.println(string);
        }
    }
}

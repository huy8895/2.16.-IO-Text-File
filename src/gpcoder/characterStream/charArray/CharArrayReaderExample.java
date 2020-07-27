package gpcoder.characterStream.charArray;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample {
    public static void main(String[] args) throws IOException {
        char[] chars = { 'g', 'p', 'c', 'o', 'd', 'e', 'r', '.', 'c', 'o', 'm' };

        CharArrayReader reader = new CharArrayReader(chars);
        int k = 0;

        while ((k = reader.read()) != -1){
            System.out.print((char) k);

        }
    }
}

package gpcoder.characterStream.console;

import java.io.*;

public class ReadConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = reader.readLine();
            if (name.equalsIgnoreCase("exit!")) {
                System.out.println("finished!");
                break;
            }
            System.out.println("hello " + name);

        }
    }
}

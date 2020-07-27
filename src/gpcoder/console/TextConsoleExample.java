package gpcoder.console;

import java.io.Console;
import java.io.InputStream;
import java.io.Reader;

public class TextConsoleExample {
    public static void main(String args[]){
        Console c=System.console();
        System.out.println("Enter your name: ");
        try {
            String n=c.readLine();
            System.out.println("Welcome "+n);
        } catch (NullPointerException ex){
            ex.getMessage();
        }

    }
}

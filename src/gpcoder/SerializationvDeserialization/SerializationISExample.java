package gpcoder.SerializationvDeserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationISExample {
    public static void main (String[] args) throws Exception {
        ObjectOutputStream oss = null;
        File file =new File("data");
        file.mkdir();
        try {
            oss = new ObjectOutputStream(new FileOutputStream("data/engineer.txt"));
            Engineer engineer = new Engineer(1,"huy","Java");
            oss.writeObject(engineer);
            oss.flush();
        }catch (IOException exception){
            exception.printStackTrace();
        }finally {
            oss.close();
        }
        System.out.println("success...");

    }
}

package dongvaodaongratrongjavaAPI;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,11};

        try {
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);

            for (int value : arr) {
                dout.writeInt(value);
            }
            dout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

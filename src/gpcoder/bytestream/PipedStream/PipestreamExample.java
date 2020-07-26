package gpcoder.bytestream.PipedStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedOutputStream;

public class PipestreamExample {
    private InputStream pipedInputStream;

    public static void main(String[] args) throws IOException, InterruptedException {
        new PipestreamExample().test();
    }

    private void test() throws IOException, InterruptedException {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();

        new Thread().start();

        char[] chs = new char[] { 'a', 'a', 'b', 'c', 'e' };

        for (char cha: chs){
            pipedOutputStream.write(cha);
            Thread.sleep(1000);
        }
        pipedOutputStream.close();
    }
    class ThreadRead extends Thread{
        @Override
        public void run() {
            try {
                int data = 0;
                while((data = pipedInputStream.read()) != -1){
                    System.out.println((char) data);
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            } finally {
                closeQuietly(pipedInputStream);

            }
        }

        private void closeQuietly(InputStream pipedInputStream) {
            if (pipedInputStream != null){
                try {
                    pipedInputStream.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }


}


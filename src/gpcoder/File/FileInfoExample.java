package gpcoder.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileInfoExample {
    public static void main(String[] args) throws IOException {

        File srcFile = new File("data");
        File destFile = new File("folder");

    }
    public static void copyDirectory(File srcDir,File destDir){
        if (!destDir.exists())
            destDir.mkdirs();
        if (!srcDir.exists())
            throw new IllegalArgumentException("sourceDir does not exist!");
        if (srcDir.isFile()||destDir.isFile()){
            throw new IllegalArgumentException("Either sourceDir or destDir is not a directory ");

        }



    }

    public static void doCopy(File srcDir, File destDir){
        File[] files = srcDir.listFiles();
        if (files != null && files.length>0){
            for (File file: files){
                if (file.isDirectory()){
                    File newDir = new File(destDir,file.getName());
                    System.out.println("created DIR: " + newDir.getAbsolutePath());
                    newDir.mkdir();

                    doCopy(file,newDir);
                }

            }
        }
    }
}

package 作业530.作业1.练习5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFolder {

    public static void main(String[] args) throws IOException {


        File srcFolder = new File("P:\\testarea");


        File destFolder = new File("P:\\CopyTestArea");


        if (!destFolder.exists()) {

            destFolder.mkdir();

        }


        File[] fileArray = srcFolder.listFiles();


        for (File file : fileArray) {


            String name = file.getName();

            File newFile = new File(destFolder, name);


            copyFile(file, newFile);

        }

    }


    private static void copyFile(File file, File newFile) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));


        byte[] bys = new byte[1024];

        int len = 0;

        while ((len = bis.read(bys)) != -1) {

            bos.write(bys, 0, len);

        }


        bos.close();

        bis.close();

    }


}



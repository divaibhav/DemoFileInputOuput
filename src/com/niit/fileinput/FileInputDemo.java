package com.niit.fileinput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputDemo {
    public static void readFile(String fileName){
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);//READS FILES IN BYTES
            int readByte = 0;
            int count = 0;
            System.out.println("fileInputStream.available() = " + fileInputStream.available());
           /* while (fileInputStream.available() != 0) {
                System.out.print(fileInputStream.read());

            }
            System.out.println();
            System.out.println("count = " + count);*/
            byte[] b = new byte[fileInputStream.available()];
            //System.out.println(Arrays.toString(b));
            int readBlockOfBytes = fileInputStream.read(b);
            System.out.println("readBlockOfBytes = " + readBlockOfBytes);
            //System.out.println(Arrays.toString(b));
            for (byte b1 : b) {
                System.out.print((char)b1);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "resource/onemore/xyz.txt"
        readFile(fileName);
    }
}

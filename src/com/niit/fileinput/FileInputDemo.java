package com.niit.fileinput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileInputDemo {
    public static void readFile(String fileName) {
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
            Scanner scanner = new Scanner(System.in);
            int number;
            do {
                number = scanner.nextInt();
            }while (number < 1000);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found \n\n\n\n\n");
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        String fileName = "resource/onemore/xyz.txt";
        readFile(fileName);

    }
}

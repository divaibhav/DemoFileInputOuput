package com.niit.fileoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputDemo {
    public static void writeFile(String fileName){
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(fileName,true);
           char data = 'A';
            fileOutputStream.write(data);
            String s = "\n Frank Russell, 2nd Earl Russell (1865–1931), was a British nobleman, barrister and politician, the older brother of the philosopher Bertrand Russell. In his youth, he enjoyed four happy years at Winchester College, but was dismissed from Balliol College, Oxford. He married Mabel Scott in 1890, but they soon separated. Unable to get an English divorce, in 1900, he became the first celebrity to get one in Nevada, and remarried there, but the divorce was invalid in England. In June 1901, he was arrested for bigamy, and was convicted before the House of Lords, the last time a peer was convicted by the Lords. His second marriage ended after he fell in love with the novelist Elizabeth von Arnim; they wed in 1916. The couple soon separated, though they did not divorce. Russell was given junior office in the second MacDonald government in 1929, and served until his death. Frank Russell is obscure compared to his brother, and his marital difficulties led to his being dubbed the \"Wicked Earl\". (Full article...)";
            byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(bytes);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "resource/output.txt";
        writeFile(fileName);
    }
}

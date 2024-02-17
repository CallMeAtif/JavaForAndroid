package NIO_api;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Files_read_write_using_BufferedReader {

    public static String vowels = "aeiouAEIOU";
    public static void main(String[] args) {
        int n = 0;
//        try (FileInputStream fis = new FileInputStream("src/NIO_api/demo.txt");
//            BufferedReader in = new BufferedReader(new InputStreamReader(fis)))
        try(var in = Files.newBufferedReader(Paths.get("src/NIO_api/demo.txt")))
        {
            String line;

            while((line = in.readLine()) != null){
                for(int i = 0; i < line.length(); i++){
                    if(vowels.contains(String.valueOf(line.charAt(i)))){
                        n++;
                    }
                }
            }
            System.out.println(n);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}

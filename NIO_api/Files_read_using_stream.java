package NIO_api;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Files_read_using_stream {
    private static String vowels = "aeiouAEIOU";
    public static void main(String[] args) {
        try
        {
            var res =
            Files.lines(Paths.get("src/NIO_api/demo.txt"))
                    .flatMap(line -> Arrays.stream(line.split("")))
                    .filter(c -> vowels.contains(c))
                    .count();
            System.out.println(res);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class temp2{

    public static void main(String[] args) throws IOException {
        var v = Files.lines(Paths.get("src/NIO_api/demo.txt"))
                .map(String::trim)
                .filter(line -> !line.isEmpty())
                .mapToInt(String::length)
                .summaryStatistics();
        System.out.println(v);
    }
}
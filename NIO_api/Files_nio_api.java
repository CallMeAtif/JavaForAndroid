package NIO_api;

import java.io.IOException;
import java.nio.file.*;
import java.sql.SQLOutput;
import java.util.List;


public class Files_nio_api {
    public static void deleteDirectoryRecursion(Path path) throws IOException {
        if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
            try (DirectoryStream<Path> entries = Files.newDirectoryStream(path)) {
                for (Path entry : entries) {
                    deleteDirectoryRecursion(entry);
                }
            }
        }
        Files.delete(path);

        //DirectoryStream is use to iterate through all the entries in the specified directory
    }
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("src/NIO_api/demo.txt");
        Path p2 = Paths.get("src/NIO_api/copied.txt");

//        Files.createFile(p1); // --> creates a file in the specified path

//        Files.delete(p1); // --> Throws NoSuchFileException if doesn't exists (works only for files and empty folders)

//        Files.deleteIfExists(p1); // --> deletes only if the file exists at the specified path


//        Files.copy(p1,p2);  // ---> copies content from p1 and pastes it in p2 (it will create the file automatically)

//        Files.move(p1,p2); // ---> we can move files or in this case move the same file into the same directory but renames the file

//        System.out.println(Files.isSameFile(p1, p2));

        /*

        this checks if both paths refer to the same object
        this checks the path not the content
        Even if the file does not exist but paths are same/similar it won't throw an exception

         */

        var res = Files.readAllLines(p1);
        res.forEach(System.out::println);

        var v = Files.list(Paths.get("src")); // Stream of files in the given directory
        v.forEach(System.out::println);
        var v1 = Files.walk(Paths.get("src")); //Stream that traverses the file tree depth-first starting at the given directory
        v1.forEach(System.out::println);

    }
}

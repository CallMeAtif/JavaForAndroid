package NIO_api;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Path_nio_api {

    public static void main(String[] args) {
        Path p1 = Paths.get("/a/b/c"); //--> /a/b/c -> absolute path
        Path p2 = Paths.get("a","b","c"); // --> a/b/c -> relative path
//        System.out.println(p1);
//        System.out.println(p1.getClass()); --> returns the class of the path
//        System.out.println(p2);
//
//        System.out.println(p1.getFileName()); ---> return the current directory
//        System.out.println(p1.getRoot()); ---> return the roott of the directory
//        System.out.println(p1.getParent()); ---> current directory is c thats why the parents are a/b

//        System.out.println(p1.getRoot());

        Path p3 = Paths.get("a/b/c/./././d/../../c");

        /*

         ./ -----> current directory
         ../ ----> one directory up

         a/b/c/./././d/../../c

         a/b/c/d/../../c

         a/b/c

         */

        System.out.println(p3.normalize());

        Path p4 = Paths.get("a/../../../b"); //relative path
        Path p5 = Paths.get("/a/../../../b"); // absolute path

        System.out.println(p4.normalize());
        /*
            --> returns ../../b because as its a relative path
            it doesn't know where its root if we can perform the operation or not
            so it just stops there

        */

        System.out.println(p4.normalize());
        /*
            --> returns /b because as it's an absolute path there is nothing above
            current directory (ROOT) so it keeps performing ../ on root and just returns /b

         */

//        Path p6 = Paths.get("a/b/c");
//        Path p7 = Paths.get("d/e/f");
//
//        System.out.println(p6.resolve(p7).toString());

        Path p6 = Paths.get("/a/b/c"); //absolute path
        Path p7 = Paths.get("d/e/f"); //relative path

        System.out.println(p6.resolve(p7).toString());
        System.out.println(p7.resolve(p6).toString());
        /*
            if absolute path is resolved(JOINED) with relative path ---> p6.resolve(p7) --> /a/b/c/d/e/f
            if relavtive path is resolved(JOINED) with absolute path ---> p7.resolve(p6) --> /a/b/c
         */
        System.out.println(p6.resolve(p7).getFileSystem().toString());

        for(int i = 0; i < p7.getNameCount(); i++){
            System.out.println(p7.getName(i)); // ---> getName returns the directory at given index
        }

        System.out.println(p6.subpath(0, 2)); // --> prints the subpath in this case a/b

        Path p8 = Paths.get("a/b/c");
        Path p9 = Paths.get("a/e/f");
        /*
            ../../e/f

            You can use relativize only if both paths are relative or both are absolute
         */
        System.out.println(p8.relativize(p9).toString());
    }
}

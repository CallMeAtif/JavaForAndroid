import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Stream;

class temp {
//    public static void printPascalTri(int size) {
//        int arr[][] = new int[size][size];
//        int col, row;
//        for (row = 0; row < size; row++) {
//            for (col = 0; col < size; col++) {
//                arr[row][col] = 0;
//            }
//        }
//        arr[0][0] = 1;
//        arr[1][0] = 1;
//        arr[1][1] = 1;
//
//        for (row = 2; row < size; row++) {
//            arr[row][0] = 1;
//            for (col = 1; col <= row; col++) {
//                arr[row][col] = arr[row - 1][col - 1] + arr[row - 1][col];
//            }
//        }
//
//        for (row = 0; row < size; row++) {
//            for (col = 0; col <= row; col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }
//    }

    public static void printTriangle(int size){
        int arr[][] = new int[size][size];
        for(int i = 0; i < size;i++){
            for(int j = 0; j < size;j++){
                if(i == j){
                    arr[i][j] = 0;
                } else if (j > i) {
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = -1;
                }
            }
        }

        for(int [] i : arr){
            for(int j : i)
                System.out.print(j);
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        printPascalTri(5);

        printTriangle(3);

    }
}

//import org.w3c.dom.ls.LSOutput;
//
//import java.io.FileOutputStream;
//import java.util.Scanner;
//class Fact{
//    public int fact(int n){
//        if(n==1 || n==0)
//            return 1;
//        else{
//            for(int i = 1; i < fact(n);i++){
//                System.out.println(i + " x " + fact(n));
//            }
//            return n * fact(n-1);
//        }
//
////        for(int i = 1; i <= n; i++){
////            int b = n * i;
////            System.out.println(b);
////        }
//    }
//}

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//class MyThread extends Thread{
//    public void run(){
//        while(true){
//            System.out.println("I am a thread" + Thread.class());
//            try {
//                Thread.sleep(1200);
//            }
//            catch (Exception e) {
//                throw new RuntimeException();
//            }
//        }
//    }
//}


class EvenNumber implements Runnable{
    EvenNumber(){
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        for(int i = 1; i <= 20; i+=2){
            System.out.println(i);
            try {
                Thread.sleep(1100);
            }
            catch (Exception e){
                throw new RuntimeException();
            }
        }
    }

}class OddNumber implements Runnable{
    OddNumber(){
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        for(int i = 0; i <= 20; i+=2){
            System.out.println(i);
            try {
                Thread.sleep(1100);
            }
            catch (Exception e){
                throw new RuntimeException();
            }
        }
    }
}

public class Main {
//
//    public static void bubbleSort(int [] arr) {
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 1; j < arr.length-i; j++) {
//                if (arr[j - 1] > arr[j]) {
//                    int temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//
//
//    public static void printArray(int [] arr){
//        for(int i = 0; i < arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//    public static void printFact(int n){
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            System.out.println(i + " x " + fact + " = " + fact*i );
//            fact=fact*i;
//
//        }
//        System.out.println("Factorial of "+n+" is: "+fact);
//    }
//
//
//    public static void printPyramid(int rows,int g){
//        for(int i = 1; i <= rows;i++,g=0){
//            for(int blank = 1; blank <= rows - i; blank++){
//                System.out.print("  ");
//            }
//            while(g != 2*i-1){
//                System.out.print("* ");
//                g++;
//            }
//            System.out.println();
//        }
//    }

//    public static boolean isPalindrome(String a){
//        StringBuilder b = new StringBuilder();
//        for(int i = a.length()-1;i>=0;--i){
//            b.append(a.charAt(i));
//        }
//        if(b.equals(a))
//            return true;
//        else
//            return false;
//    }
    public static void StringRev(String a){

        StringBuilder s = new StringBuilder();
        for(int i = a.length()-1; i>=0;--i){
            s.append(a.charAt(i));
        }

        System.out.println(a + " " + s);
    }
//    public static boolean isPalindrome(String a){
//
//        StringBuilder s = new StringBuilder();
//        for(int i =a.length()-1; i>=0;--i){
//            s.append(a.charAt(i));
//        }
//
//        System.out.println("This is Palindrome: ");
//
//        if(s.toString().equals(a)){
//            return true;
//        }
//        else
//            return false;
//
//
//
//    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println(StringRev("121"));
////        System.out.println(isPalindrome("heh"));

//        System.out.println("Printing Factorial\n");
//        printFact(5);


//        int[] arr = {32, 3, -23, 9, -2, 81, -6};
//        bubbleSort(arr);
//
//        System.out.println("Printing Pyramid");
//
//        printPyramid(5, 0);
//
//
//        System.out.println("Printing Array");
//
//        printArray(arr);
//        StringBuilder d = new StringBuilder();




//        StringBuilder s = new StringBuilder();
//        String a = "hello world";
//        for(int i = a.length()-1; i>=0;--i){
//            s.append(a.charAt(i));
//        }
//
//        System.out.println(s);
//
//
//        Scanner sc = new Scanner(System.in);
//        StringRev("Hello World");


//        new EvenNumber();
//        new OddNumber();

        ArrayList<Object> a = new ArrayList<>();
        a.add(4);
        a.add("Hello");
        a.add(40.5f);









    }

    }

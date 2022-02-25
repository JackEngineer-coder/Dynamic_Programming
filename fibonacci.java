import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] qb = new int[n+1];
    int fibn = Fibonacci(n,qb);
    System.out.println(fibn);
 }
 public static int Fibonacci(int n, int [] qb)
 {   if(n==0 || n==1)
     {
       return n;
     }
     if(qb[n] !=0)
     {
         return qb[n];
     }
     int fib1 = Fibonacci(n-1,qb);
     int fib2 = Fibonacci(n-2,qb);

     int fibn = fib1 + fib2;

     qb[n] = fibn;

     return fibn;
 }

}

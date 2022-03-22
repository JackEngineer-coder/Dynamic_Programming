import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int ozeros= 1;
    int oones =1;


    for(int i=2; i<=n;i++)
    {
       int nzeros= oones;
       int nones = ozeros+oones;

       oones = nones;
       ozeros= nzeros;
    }
    System.out.println(oones+ozeros);
 }

}

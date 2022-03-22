import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();


    int oz = 1;
    int oo =1;

    for(int i=2; i<=n; i++)
    {
        int no = oz+oo;
        int nz = oo;

        oo= no;
        oz = nz;
    }

    long total = oo+oz;
    total = total*total;

    System.out.println(total);
 }

}

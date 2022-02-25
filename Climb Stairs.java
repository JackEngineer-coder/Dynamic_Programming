import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] qb = new int[n+1];

        int count = countPath(n,qb);
        System.out.println(count);
    }

    public static int countPath(int n, int [] qb)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(qb[n] != 0)
        {
            return qb[n];
        }
        int cp1 = countPath(n-1, qb);
        int cp2 = countPath(n-2,qb);
        int cp3 = countPath(n-3,qb);

        int cp = cp1+cp2+cp3;

        qb[n] = cp;
        return cp;

    }

}

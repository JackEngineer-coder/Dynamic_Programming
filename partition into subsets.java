import java.io.*;
import java.util.*;

public class Main {
        
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        if(n==0|| k==0|| n<k)
        {
            System.out.println(0);
            return;
        }

        long [][] dp = new long[k+1][n+1];

        for(int team=1;team<=k;team++)
        {
            for(int people=1;people<=n;people++)
            {
                if(team>people)
                {
                  dp[team][people] = 0;
                }else if(team==people)
                {
                   dp[team][people] = 1;
                }
                else
                {
                   dp[team][people] = dp[team-1][people-1]+dp[team][people-1]*team;
                }
            }
        }

        
        System.out.println(dp[k][n]);
    }
}

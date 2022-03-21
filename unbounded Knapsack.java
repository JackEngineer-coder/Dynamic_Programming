import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner(System.in);
		  int n = scn.nextInt();

		  int [] vals = new int[n];
		  int [] wts = new int[n];

		  for(int i=0; i<vals.length;i++)
		  {
			  vals[i] = scn.nextInt();
		  }
		  for(int i=0; i<wts.length;i++)
		  {
			  wts[i] = scn.nextInt();
		  }

		  int cap = scn.nextInt();

		  int [] dp = new int [cap+1];
		  dp[0] =0;

		  for(int bagcap =1; bagcap < dp.length;bagcap++)
		  {
			  int max=0;
			  for(int i=0;i<n;i++)
			  {
				  if(bagcap>=wts[i])
				  {
					 int rembagcap = bagcap-wts[i];
					 int rembagval = dp[rembagcap];
					 int tbagval = rembagval + vals[i];
					 if(tbagval>max){
						 max=tbagval;
				        }
				  }
			  }
			  dp[bagcap] = max;
		  }
		  System.out.println(dp[cap]);
	    }
	}

import java.util.*;
import java.io.*;


public class Bronze
{
    public static void main(String[]args)
    {
	try{
	    BufferedReader in = new BufferedReader(new FileReader("makelake.in"));
	
	    int r;
	    int c;
	    int e;
	    int n;
	    String first = in.readLine();
	    r=Integer.parseInt(first.split(" ")[0]);
	    c=Integer.parseInt(first.split(" ")[1]);
	    e=Integer.parseInt(first.split(" ")[2]);
	    n=Integer.parseInt(first.split(" ")[3]);
	    

	    int[][] level = new int[r][c];
	    int[][] go = new int[n][3];
	    
	    for(int i = 0;i<r;i++)
		{
		    String next = in.readLine();
		    for(int j = 0;j<c;j++)
			{
			    level[i][j]=Integer.parseInt(next.split(" ")[j]);
			}
		}
	    for(int i=0;i<n;i++)
		{
		    String next = in.readLine();
		    for(int j=0;j<2;j++)
			{
			    go[i][j]=Integer.parseInt(next.split(" ")[j])-1;
			}
		    go[i][2]=Integer.parseInt(next.split(" ")[2]);
		    int max=max(level,go[i][0],go[i][1]);
		    for(int k=go[i][0];k<go[i][0]+3;k++)
			{
			    for(int j=go[i][1];j<go[i][1]+3;j++)
				{
				    if(level[k][j]>=max-go[i][2])
					{
					    level[k][j]=max-go[i][2];
					}
				}
			}
		}
	    int sum=0;
	    for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
			{
			    //			    System.out.print(level[i][j]+ " ");
			    if(level[i][j]<=e)
				{
				   sum+=e-level[i][j];
				}
			}
		    //		    System.out.println();
		}
	    //	    System.out.println(sum);
	    int ret = sum*72*72;
	    System.out.println(ret+",7,Zhang,Charles");

	    
	    
	    
	    
	}
	catch(Exception e)
	    {System.out.println(e);}
    }
    
    public static int max(int[][] num,int a,int b)
    {
	int max=0;
	for(int i=a;i<a+3;i++)
	    {
		for(int j=b;j<b+3;j++)
		    {
			max=Math.max(max,num[i][j]);
		    }
	    }
	return max;
    }
}

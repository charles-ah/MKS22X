import java.util.*;
import java.io.*;
public class Silver
{

    public static void main(String[]args)
    {
	try
	    {
		BufferedReader in = new BufferedReader(new FileReader("ctravel.in"));
		String first = in.readLine();
		int row = Integer.parseInt(first.split(" ")[0]);
		int col = Integer.parseInt(first.split(" ")[1]);
		int time = Integer.parseInt(first.split(" ")[2]);

		int[][] land = new int[row][col];
		int[][] temp;
		for(int i=0;i<row;i++)
		    {
			String next = in.readLine();
			for(int j=0;j<col;j++)
			    {
				if(next.charAt(j)=='*')
				    {
					land[i][j]=-1;
				    }
				System.out.print(land[i][j]);
			    }
			System.out.println();
		    }
		String last = in.readLine();
		int startx=Integer.parseInt(last.split(" ")[1])-1;
		int starty=Integer.parseInt(last.split(" ")[0])-1;
		int endx=Integer.parseInt(last.split(" ")[2]);
		int endy=Integer.parseInt(last.split(" ")[3]);
		    
		
		for(int t=0;t<time;t++)
		    {
			if(t==0)
			    {
				int[] goy={startx+1,startx-1,startx,startx};
				int[] gox={starty,starty,starty-1,starty+1};
				for(int i=0;i<4;i++)
				    {
					if(gox[i]>=0&&gox[i]<col&&goy[i]>=0&&goy[i]<row&&land[goy[i]][gox[i]]!=-1)
					    {
						land[gox[i]][goy[i]]=1;
					    }
				    }
			    }
			else
			    {
				for(int i=0;i<row;i++)
				    {
					for(int j=0;j<col;j++)
					    {
						if(land[i][j]==t)
						    {
							land[i][j]=0;
							int[] goy={i+1,i-1,i,i};
							int[] gox={j,j,j-1,j+1};
							for(int k =0;k<4;k++)
							    {
								if(gox[k]>=0&&gox[k]<col&&goy[k]>=0&&goy[k]<row&&land[goy[k]][gox[k]]!=-1)
								    {
									if(t==time-1)
									    {
										land[gox[k]][goy[k]]+=time;
									    }
									else
									    {
										land[gox[k]][goy[k]]=t+1;
									    }
								    }
							    }
						    }

					    }
				    }
			    }
			
		    }			System.out.println(land[endx-1][endy-1]);
		
	    }
	catch(IOException e)
	    {System.out.println(e);}



     
    }


}

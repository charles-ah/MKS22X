public class KnightBoard
{

    int board[][];
    
    public KnightBoard(int col,int row)
    {
	board = new int[row][col];
    }

    public boolean solve()
    {
	return solveH(0,0,1);
    }

    public boolean solveH(int row,int col,int jump)
    {
	if(jump>=board.length*board[0].length)                                                                                                                                                    
	    {return true;}        

	int goRow[]={row+1,row-1,row+2,row-2,row+1,row-1,row+2,row-2};
	int goCol[]={col+2,col+2,col+1,col+1,col-2,col-2,col-1,col-1};
	for(int i=0;i<8;i++)
	    {
		if(goRow[i]<board.length && goRow[i]>=0)
		    {
		       
			    {
				if(goCol[i]<board[0].length && goCol[i]>=0 &&  board[goRow[i]][goCol[i]]==0)
				    {
					addKnight(goRow[i],goCol[i],jump);
					if(solveH(goRow[i],goCol[i],jump+1))
					    {return true;}
					else
					    {removeKnight(goRow[i],goCol[i]);}
				    }

			    }
		    }
	    }
		if(jump>=board.length*board[0].length)
		    {return true;}
		return false;
    }
    
    public void addKnight(int row,int col,int jump)
    {
	board[row][col]=jump;
    }

    public void removeKnight(int row,int col)
    {
	board[row][col]=0;
    }
    
    public void printSolution()
    {
	for(int i=0;i<board.length;i++)
	    {
		for(int j=0;j<board[0].length;j++)
		    {
			if(board[i][j]<10)
			    {
				System.out.print("_"+board[i][j]+"\t");
			    }
			else
			    {
				System.out.print(board[i][j]+"\t");
			    }

		    }
	System.out.print("\n");
	    }
    }

    public static void main(String[]args)
    {
	if(args.length==0)
	    {
		throw new IllegalArgumentException("Please specify the number of columns and rows: [column] [row]");
	    }
	
	KnightBoard test = new KnightBoard(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	System.out.println(test.solve());
	test.printSolution();
    }



}

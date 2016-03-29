public class ParenDemo
{
    public static boolean isMatching(String s)
    {
	MyStack<String> stack = new MyStack<String>();
	for(int i=0;i<s.length();i++)
	    {
		//		System.out.println(stack.toString());
		if(!stack.isEmpty())
		    {
		if(s.charAt(i)==')'&&stack.peek().equals("("))
		    {
			//System.out.println("matched");
			stack.pop();
		    }
		if(s.charAt(i)==']'&&stack.peek().equals("["))                                                                                                                                                                 {                                                                                                                                                                                                               stack.pop();                                                                                                                                                                                          } 
		if(s.charAt(i)=='}'&&stack.peek().equals("{"))
		    {
			stack.pop();
		    }
		if(s.charAt(i)=='>'&&stack.peek().equals("<"))
		    {
			stack.pop();
		    }
		    }
		else
		    {
			stack.push(s.substring(i,i+1));
		    }
		
      		if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='<')
		    {
			stack.push(s.substring(i,i+1));
		    }
	    }
	//	System.out.println(stack.toString());
	return stack.size()==0;
	
    }



    public static void main(String[]args)
    {
	String input = "()()(([[]]))";
	if(args.length > 0)
	    {
		input = args[0];
		System.out.println( isMatching(input)); 
	    }
	else
	    {
		System.out.println("Usage:"); 
		System.out.println("java ParenDemo \"text\""); 
	    }
 
    }


}

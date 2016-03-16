public class MyLinkedList
{

    LNode start;
    private int size;


    public class LNode
    {
	int data;
	LNode next;
	
	public LNode(int val)
	{
	    //	    System.out.println("creating new node with value"+val);
	    data=val;
	    // System.out.println("node data"+data);
	}

	public void setNext(LNode node)
	{
	    next = node;
	}
	public int get()
	{
	    // System.out.println(data);
	    return data;
	}
	public void set(int n)
	{
	    data=n;
	}
    }
    
    public MyLinkedList()
    {
	size=0;
    }
    
    public int getSize(){return size;}
    
    public void add(int newValue)
    {
	LNode cur=start;
	//System.out.println("adding"+newValue);
	if(size==0)
	    {
		start = new LNode(newValue);
	    }
	else
	    {
		while(cur.next!=null)
		    {
			//System.out.println("k");
			cur = cur.next;
		    }
		cur.next=new LNode(newValue);
	    }
	size++;
	cur = new LNode(newValue);
    }
    
    public String toString()
    {
	String ret="";
	LNode cur=start;
	for(int i=0;i<size;i++)
	    {
		//System.out.println("??");
		//System.out.println(cur.data);
		ret += cur.get()+",";
		cur=cur.next;
	    }
	
	return "["+ret+"]";
    }
    
}

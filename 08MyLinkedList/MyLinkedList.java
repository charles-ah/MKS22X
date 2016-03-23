public class MyLinkedList<T>
{

    LNode start;
    LNode end;
    private int size;


    private class LNode
    {
	T data;
	LNode next;
	
	public LNode(T val)
	{
	    //	    System.out.println("creating new node with value"+val);
	    data=val;
	    // System.out.println("node data"+data);
	}

	public void setNext(LNode node)
	{
	    next = node;
	}
	public T get()
	{
	    // System.out.println(data);
	    return data;
	}
	public void set(T n)
	{
	    data=n;
	}
    }
    
    public MyLinkedList()
    {
	size=0;
    }
    
    public int size(){return size;}
    
    public void add(T newValue)
    {
	LNode cur=start;
	//System.out.println("adding"+newValue);
	if(size==0)
	    {
		start = new LNode(newValue);
		end = start;
	    }
	else 
	    {
		end.next = new LNode(newValue);
		end = end.next;
	    }
	size++;
	//cur = new LNode(newValue);
    }
    
    public T get(int index)
    {
	if(index<0||index>size-1)
	    {
		return null;
		//throw new IllegalArgumentException("you fool");
	    }

	LNode cur = start;
	for(int i=0;i<index;i++)
	    {
		cur=cur.next;
	    }
	return cur.get();
    }

    public T set(int index,T newValue)
    {
	if(index<0||index>size-1)
	    {
		return null;
	    }

	LNode cur =start;
	for(int i=0;i<index-1;i++)
	    {
		cur=cur.next;
	    }
	T old = cur.data;
	cur.data=newValue;
	return old;
    }

    public T remove(int index)
    {
	if(index<0||index>size-1)
	    {
		return null;
		//throw new IllegalArgumentException("you fool");
	    }
	
	LNode cur=start;
	
	if(index==0)
	    {
		T old=start.get();
		start = start.next;
		size--;
		return old;
	    }

	for(int i=0;i<index-1;i++)
	    {
		cur=cur.next;
	    }
	if(index<size-1)
	    {
		LNode befcur = cur;
		LNode afcur = (cur.next).next;
		befcur.next = afcur;
		size--;
		return cur.get();
	    }
	else if(index==size-1)
	    {
		size--;
		cur.next=null;
		return cur.get();
	    }
	return null;
	
    }

    public boolean add(int index,T value)
    {
	if(index<0 || index>size)
	    {
		return false;
		//throw new IllegalArgumentException("you fool");
	    }
	
	LNode cur=start;
	if(index==0)
	    {
		LNode newstart = new LNode(value);
		start=newstart;
		newstart.next=cur;
		size++;
		System.out.println("added to front");
		return true;
	    }
	for(int i=0;i<index-1;i++)
	    {
		cur=cur.next;
	    }
	if(index<size)
	    {
		LNode befcur = cur;
		LNode afcur = cur.next;
		LNode newcur = new LNode(value);
		befcur.next=newcur;
		newcur.next=afcur;
		size++;
		return true;
	    }
	else if(index==size)
	    {
		add(value);
		return true;
	    }
		return false;
    }
    
    

    public String toString(boolean b)
    {
	String ret="";
	LNode cur=start;
	for(int i=0;i<size;i++)
	    {
		ret += (cur.get()).toString();
		if(i<size-1)
		    {
			ret+=" ,";
		    }
		if(i<size-1)
		    {
			cur=cur.next;
		    }
	    }
	
	return "["+ret+"]" +" head: "+start.get() +" tail: "+end.get();
    }
    
}

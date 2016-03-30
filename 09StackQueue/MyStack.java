import java.util.*;
public class MyStack<T>
{

    public MyStack()
	{
	    list = new MyLinkedList<T>();
	}

    /**
     * Adds the given item to the top of the stack.
     */
    MyLinkedList<T> list;

    public void push(T item)
    {
	list.add(0,item);
    }

    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T pop()
    {
	if(list.size()==0)
	    {
		throw new NoSuchElementException();
	    }
	return list.remove(0);
    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T peek()
    {
	if(list.size()==0)
	    {
		throw new NoSuchElementException();
	    }
	return list.get(0);
    }

    /**
     * Returns the number of items currently in the stack.
     */
    public int size()
    {
	return list.size();
    }

    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty()
    {
	return size()==0;
    }

    public String toString()
    {
	return list.toString();
    }
    
    public static void main(String[]args)
    {
	MyStack<Integer> s = new MyStack<Integer>();
	for(int i=0;i<10;i++)
	    {
		s.push((int)(10*Math.random()));
		System.out.print(s.peek()+" ");
	    }
	System.out.println();
	for(int i=0;i<10;i++)
	    {
		System.out.print(s.pop()+" ");
	    }
    }

}

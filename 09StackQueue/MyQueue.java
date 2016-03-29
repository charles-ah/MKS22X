import java.util.*;
public class MyQueue<T>
{

    MyLinkedList<T> list;

    /**
     * Adds the given item to the rear of the queue.
     */
    public MyQueue()
	{
	    list = new MyLinkedList<T>();
	}

    public void enqueue(T item)
    {
	list.add(item);
    }

    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T dequeue()
    {
	if(list.size()==0)
	    {
		throw new NoSuchElementException();
	    }
	return list.remove(0);
    }

    /**
     * Returns the front item from the queue without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T peek()
    {
	return list.get(0);
    }

    /**
     * Returns the number of items currently in the queue.
     */
    public int size()
    {
	return list.size();
    }

    /**
     * Returns whether the queue is empty or not.
     */
    public boolean isEmpty()
    {
	return list.size()==0;
    }




}

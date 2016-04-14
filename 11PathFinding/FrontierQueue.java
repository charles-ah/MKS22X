public class FrontierQueue<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/
    /***You can use your classes or built in ones***/
    /***You can extend another class OR wrap around it***/
    private MyQueue<T> frontier;

    public FrontierQueue()
	{
	    frontier = new MyQueue<T>();
	}

    public void add(T element)
    {
	frontier.enqueue(element);
    }

    public T next()
    {
	return frontier.dequeue();
    }

    public boolean hasNext()
    {
	return frontier.peek()!=null;
    }

}

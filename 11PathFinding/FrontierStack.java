public class FrontierStack<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/
    /***You can use your classes or built in ones***/
    /***You can extend another class OR wrap around it***/
    private MyStack<T> frontier;

    public FrontierStack()
	{
	    frontier = new MyStack<T>();
	}

    public void add(T element)
    {
	frontier.push(element);
    }

    public T next()
    {
	return frontier.pop();
    }

    public boolean hasNext()
    {
	return frontier.size()==0;
    }

}

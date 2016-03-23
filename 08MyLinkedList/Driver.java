public class Driver
{

    public static void main(String[] args)
    {
	MyLinkedList<String> test = new MyLinkedList<String>();

	test.add("hi");
	test.add("myself");
	test.add("charles");
	for(int i=0;i<test.size();i++)
	    {
		System.out.println(test.get(i));
	    }
	System.out.println(test.toString(true));
	test.add(0,"nope");
	System.out.println(test.toString(false));
	test.add(3,"nope");
	System.out.println(test.toString(true));
	/*
	test.remove(2);
	System.out.println(test);
	*/
	}

}

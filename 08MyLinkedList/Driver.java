public class Driver
{

    public static void main(String[] args)
    {
	MyLinkedList<String> test = new MyLinkedList<String>();

	test.add("hi");
	test.add("myself");
	test.add("charles");
	for(int i=0;i<test.getSize();i++)
	    {
		System.out.println(test.get(i));
	    }
	System.out.println(test.toString());
	test.add(0,"nope");
	System.out.println(test);
	test.add(3,"nope");
	System.out.println(test);
	/*
	test.remove(2);
	System.out.println(test);
	*/
	}

}

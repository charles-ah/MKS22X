public class Quick
{
    public static String name()
    {
	return "7,Zhang,Charles";
    }
    
    public static void printArray(int[]data)                                                                                                                                                               
    {                                                                                                                                                                                                      
        String strArray = "";                                                                                                                                                                              
        for (int i = 0;i < data.length-1;i++)                                                                                                                                                              
            {                                                                                                                                                                                              
                strArray+=data[i] + ",";                                                                                                                                                                   
            }                                                                                                                                                                                              
        System.out.println( "["+strArray+data[data.length-1]+"]");                                                                                                                                         
    }  
    
    public static void swap(int[] num,int a,int b)
    {
	int temp =  num[a];
	num[a]=num[b];
	num[b]=temp;
    }

    private static int partition(int[]data, int left, int right) 
    {

	int k=(int)(Math.random()*(right-left))+left;

	for(int i=left;i<right;i++)
	    {
		if(data[i]<data[k]&&i>k)
		    {
			swap(data,k,i);
			k=i;
		    }
		else if(data[i]>data[k]&&i<k)
			{
			    swap(data,k,i);
			    k=i;
			}
	    }
	return k;
	
    }

    


    //choose a random partition element at a location from left to right inclusive.
    //partition the array such that the randomly chosen element divides all values smaller and larger than it. 
    //smaller elements on the left side of the partition, larger on the right side
    //return the index of the partition element. 
    // this allows your quickselect method to decide where to go next.

    
    public static int quickselect(int[]data, int k) 
    {
	return quickhelp(data,k,0,data.length);
    }
    //return the kth smallest value.
    // when k = 0 return the smallest.
    // 0 <= k < data.length

    private static int quickhelp(int[]data,int k,int start,int end)
    {
	int index=partition(data,start,end);
	if(index==k)
	    {
		return data[index];
	    }
	else
	    {
		if(index>k)
		    {
			return quickhelp(data,k,start,index);
		    }
		if(index<k)
		    {
			return quickhelp(data,k,index,end);
		    }
	    }
	return 0;
    }


    public static void main(String[]args)
    {
	//	Quick test = new Quick();
	int[] arr = {1,2,3};
	System.out.println(quickselect(arr,1));
    }

}


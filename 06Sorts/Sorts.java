import java.util.Arrays;
import java.util.*;


public class Sorts
{

    public static String name(){
	return "7,Zhang,Charles";     //  or    "6,Last,First"
    }

    public static int indexOf(int[] nums,int num)
    {
       
	for(int i = 0;i < nums.length;i++)
	    {
		if (nums[i]==num)
		    {
			return i;
		    }
	    }
	return -1;
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
    
    public static void insertionSort(int[] data) {                                                                                                                                                         
        for (int i = 0; i < data.length; i++) {                                                                                                                                                            
            for (int j = 0; j < data.length - 1; j++) {                                                                                                                                                    
                if(data[j] >= data[j + 1]) {                                                                                                                                                               
                    int temp = data[j];                                                                                                                                                                       
                    data[j] = data[j + 1];                                                                                                                                                                 
                    data[j + 1] = temp;                                                                                                                                                                       
                }                                                                                                                                                                                          
            }                                                                                                                                                                                              
        }                                                                                                                                                                                                  
    }

    public static void selectionSort(int nums[])
    {
	int count = 0;
	int temp;
	while(count<nums.length)
	    {
		int x = min(Arrays.copyOfRange(nums,count,nums.length));
		int index = count+indexOf(Arrays.copyOfRange(nums,count,nums.length),x);
		
		temp = nums[count];
		nums[count] = x;
		nums[index] = temp;
		count++;
	    }
    }

    public static void bubbleSort(int nums[])
    {

	for(int i = 0;i<nums.length-1;i++)                                                                                                                                                                            {
	    for(int j = 0;j<nums.length-i-1;j++)
		{
		    if(nums[j]>nums[j+1])                                                                                                                                                                   
			{
			    int temp = nums[j];                                                                                                                                                                
			    nums[j] = nums[j+1];                                                                                                                                                          
			    nums[j+1] = temp;                                                                                                                                                           
                    }                                                                                                                                                                                      
            } 
	}

    }
    
    public static int min(int nums[])
    {
	//	printArray(nums);
	int temp = nums[0];
	//	System.out.println("ayy");
	for(int i = 0;i<nums.length;i++)
	    {
		temp = Math.min(temp,nums[i]);
	    }
	return temp;
    }


    public static void fillRandom(int[] nums)
    {
	for(int i =0;i<nums.length;i++)
	    {
		nums[i]=(int)(100*Math.random());
	    }
    }

    public static void swap(int[]nums,int pos1,int pos2)
    {
	int temp = nums[pos1];
	nums[pos1]=nums[pos2];
	nums[pos2]=temp;
    }


    public static void merge(int[]num)
    {
	int[] ret = mergeH(num,0,num.length);
	for(int i=0;i<ret.length;i++)
	    {
		num[i]=ret[i];
	    }
    }

    public static int[] mergeH(int[]num,int start,int end)
    {
	if(end-start<=1)
	    {
		int[] ret=new int[1];
		ret[0]=num[start];
		return ret;
	    }
	else
	    {
		return mergeHelp(mergeH(num,start,start+(end-start)/2),mergeH(num,start+(end-start)/2,end));
	    }

    }
    public static int[] mergeHelp(int[]a,int[]b)
    {
	ArrayList<Integer> ret = new ArrayList<Integer>(0);
	int j=0;
	int i=0;
	//	for(int i=0;i<Math.min(a.length,b.length);i++)
	while(i<Math.min(a.length,b.length) && j<Math.min(a.length,b.length))
	{
		if(a[j]>=b[i])
		    {
			while(a[j]>=b[i])
			    {
				ret.add(b[i]);
				if(i+1<Math.min(a.length,b.length))
				    {
					i++;
				    }
				else
				    {
					//j++;
					break;
				    }
			    }
			ret.add(a[j]);
			j++;
		    }
		else
		    {
			while(b[i]>=a[j])
			    {
				ret.add(a[j]);
				if(j+1<Math.min(a.length,b.length))
				    {
					j++;
				    }
				else
				    {
					//i++;
					break;
				    }
			    }
			ret.add(b[i]);
			i++;
		    }
		//	       j++;
	    }

	if(a.length>b.length)
	    {
		for(int k=b.length;k<a.length;k++)
		    {
			ret.add(a[k]);
		    }
	    }
	if(a.length<b.length)
	    {
		for(int k=a.length;k<b.length;k++)
		    {
			ret.add(b[k]);
		    }
	    }
	int[] result= new int[ret.size()];
	for(int k=0;k<ret.size();k++)
	    {
		result[k]=ret.get(k);
	    }
	printArray(result);
	return result;
    }
}

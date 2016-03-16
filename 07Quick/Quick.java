import java.util.*;

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

    private static int partitionOld(int[]data, int left, int right) 
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

    
    public static int quickselectOld(int[]data, int k) 
    {
	return quickhelpOld(data,k,0,data.length);
    }
       //return the kth smallest value.
    // when k = 0 return the smallest.
    // 0 <= k < data.length

    private static int quickhelpOld(int[]data,int k,int start,int end)
    {
	int index=partitionOld(data,start,end);
	if(index==k)
	    {
		return data[index];
	    }
	else
	    {
		if(index>k)
		    {
			return quickhelpOld(data,k,start,index);
		    }
		if(index<k)
		    {
			return quickhelpOld(data,k,index,end);
		    }
	    }
	return 0;
    }

    public static void quickSortOld(int[]data)
    {
	//quickSort(data,0,data.length,0);
	for(int i=0;i<data.length;i++)
	    {
		quickselectOld(data,i);
	    }
    }

    private static void quickSortOld(int[]data,int start,int end,int k)
    {
	int index=partitionOld(data,start,end);                                                                                                                                                               
        if(index!=k)
	    {
		quickSortOld(data,start,index,k);                                                                                                                                              
		quickSortOld(data,index,end,k);                                                                                                                                                
	    }
	else if(k<data.length-1)
	    {
		quickSortOld(data,0,data.length,k+1);
	    }
    }

    public static void quickSort(int[]data)                                                                                                                                                                
    {                                                                                                                                                                                                      
        quickSort(data,0,data.length,0); 
	/*
        for(int i=0;i<data.length;i++)                                                                                                                                                                     
            {                                                                                                                                                                                              
                quickselect(data,i);                                                                                                                                                                       
            }
	*/                                                                                                                                                                                              
    }                                                                                                                                                                                                      
                                                                                                                                                                                                           
    private static void quickSort(int[]data,int start,int end,int k)                                                                                                                                       
    {                                                                                                                                                                                                      
        int[] index=partition(data,start,end);                                                                                                                                                               
        if(!(index[0]>=k&&k<=index[1]))                                                                                                                                                                    
            {                                                                                                                                                                                              
                quickSort(data,start,index[0]+1,k);                                                                                                                                                           
                quickSort(data,index[1],end,k);                                                                                                                                                                        }                                                                                                                                                                                              
        else if(k<data.length)                                                                                                                                                                          
            {                                                                                                                                                                                              
                quickSort(data,0,data.length+1,k+1);                                                                                                                                                        
            }                                                                                                                                                                                              
    } 

    private static int[] partition(int[]data, int left, int right)                                                                                                                                         
    {                                                                                                                                                                                                      
                                                                                                                                                                                                           
        int k=(int)(Math.random()*(right-left+1))+left;                                                                                                                                                      
                                                                                                                                                                                                           
        for(int i=left;i<right;i++)                                                                                                                                                                        
            {                                                                                                                                                                                             
                if(data[i]<=data[k]&&i>k)                                                                                                                                                                   
                    {                                                                                                                                                                                      
                        swap(data,k,i);                                                                                                                                                                    
			//k=i;                                                                                                                                                                                                   }                                                                                                                                                                                                      else if(data[i]>data[k]&&i<k)                                                                                                                                                                                  {                                                                                                                                                                                   
			swap(data,k,i);                                                                                                                                                                 
			//k=i;                                                                                                                                                                            
		    }                                                                                                                                                                                            }
	for(int i=right-1;i>=left;i--)                                                                                                                                                                     
            { 
		if(data[i]<=data[k]&&i>k)                                                                                                                                                                                   {                                                                                                                                                                                                              swap(data,k,i);                                                                                                                                                                     			      k=i;                                                                                                                                                                                		     }                                                                                                                                                                                       		        else if(data[i]>data[k]&&i<k)                                                                                                                                                               		     {                                                                                                                                                                                       
                        swap(data,k,i);                                                                                                                                                                    
                        k=i;                                                                                                                                                                               
                   }                                                                                                                                                                                     	    } 

	int a,b;
	a=0;
	b=0;
	for(int i=0;i<data.length;i++)
	    {
		if(data[i]==data[k])
		    {
			a=i;
		    }
		if(i>0&&data[i-1]==data[k])
		    {
			b=i;
		    }
	    }
	int[] lol={a,b};
	return lol;
    }
    public static void main(String[]args)
    {
	//	Quick test = new Quick();
	int n=4000;
	int[] arr = new int[n];
	for(int i=0;i<n;i++)
	    {
		arr[i]=(int)(Math.random()*3);
	    }
	//        System.out.println(quickselect(arr,0));
	//System.out.println(quickselect(arr,1));
	//System.out.println(quickselect(arr,2));
	//System.out.println(quickselect(arr,3));
	//System.out.println(quickselect(arr,4));
//printArray(arr);
			   quickSort(arr);
//	Arrays.sort(arr);
	printArray(arr);
    }

}


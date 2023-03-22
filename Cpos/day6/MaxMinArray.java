class MaxMinArray{
   static int arr[]={1,320,310,440,50};
   static int max()
	{
	  
	  int max=arr[0];
	  
	  for(int i=1;i<arr.length;i++)
	  {
	    if(arr[i]>max)
		{
		  max=arr[i];
		}
      }
	   return max;
	}
	static int min()
	{
	  
	  int min=arr[0];
	  
	  for(int i=1;i<arr.length;i++)
	  {
	    if(arr[i]<min)
		{
		  min=arr[i];
		}
      }
	   return min;
	}
	

	public static void main(String args[])
	{
	  System.out.println("Maximum in array :"+max());
	  System.out.println("Minimum in array :"+min());
	  
	}
}
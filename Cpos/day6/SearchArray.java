class SearchArray{
   static int arr[]={10,20,30,40,50};
   static int Element()
	{
	  
	  int element=300;
	  int flag=0;
	  
	  for(int i=1;i<arr.length;i++)
	  {
	    if(arr[i]==element)
		{
			flag=1;
			System.out.println("Element found at Index "+i);
			break;
		  
		}
	  }
	  if(flag==1){
		  System.out.println("Element found ");
	  }
		else{
			System.out.println("Element Not found");
			
		
      }
	   return element ;
	}
	
	

	public static void main(String args[])
	{
	  System.out.println(Element());
	  // System.out.println("Minimum in array :"+min());
	  
	}
}
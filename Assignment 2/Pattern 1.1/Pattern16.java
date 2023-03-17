class Pattern16
{  
      public static void main(String args[])
	{
		for(int i=5;i>=1;i--)//works as a Row 1<=5
		{
			for(int j=5;j>=i;j--)//works as a column 
			{
				
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
    }  
}  
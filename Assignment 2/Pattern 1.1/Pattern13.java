class Pattern13{
	public static void main(String args[])
	{
		int alpha=64;
		for(int i=1;i<=5;i++)//1++2
		{
			for(int k=i;k<=5;k++)//will print space
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//print value 
			{
				System.out.print((char) (alpha+i)+" ");
			}
			
			System.out.println();
		}
		
	}
}
		
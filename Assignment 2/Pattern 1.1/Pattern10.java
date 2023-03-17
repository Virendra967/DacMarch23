class Pattern10{
	public static void main(String args[])
	{
		int alpha=64;
		for(int i=5;i>=1;i--)//1++2
		{
			for(int k=1;k<=i;k++)//will print space
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)//print value 
			{
				System.out.print((char) (alpha+j)+" ");
			}
			
			System.out.println();
		}
		
	}
}
		
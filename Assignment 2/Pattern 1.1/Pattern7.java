class Pattern7{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		 {
			 for(int k=1;k<=5-i;k++)//12345
			 {
				System.out.print(" ");
			 }
		     for(int j=1;j<=i;j++)
			 {
				System.out.print(" "+j);
			 }
			  System.out.println(" ");
			 
		 }
	}
}
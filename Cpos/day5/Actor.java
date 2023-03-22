class Actor{
     //instance variable 
     int age;
	 String name,Gender;
	 
	 
	 void dance()
	 {
		 System.out.println("Can Dance");
		
	 }
	 void Act()
	 {
		 System.out.println("Does Acting");
	 }
		  
	 void display(String name,String Gender,int age)
	 { 
	 
	   System.out.println(age);
	   System.out.println(name);
	   System.out.println(Gender); 
	 } 
	   
	public static void main(String args[])
	{
		{
		 System.out.println("Object creation");
		 Actor a1 =new Actor();
		 a1.display("Salman Khan","Male",55);
		 a1.dance();
		 a1.Act();
	    }
	}
}
	 
import java.util.Scanner;
class Circle
{
	double pi=3.14,radius,area;
	
	void area()
	{
		 System.out.println("Enter radius");
	     Scanner sc = new Scanner(System.in);
	     radius=sc.nextDouble();
		 area =3.14*radius*radius;
		
	}
	void display()
	{
		 System.out.println("Area of cirlce is :"+area);
	}
		
	public static void main(String args[])
	{
	 Circle C =new Circle();
	 C.area();
	 C.display();
	 
	  
	  
	 }

} 
import java.util.Scanner;
class Shape
{
	double pi=3.14,radius,area,breadth,height,side,length,base;
	Scanner sc = new Scanner(System.in);
	
	void areaOfCirlce()
	{
		 System.out.println("Enter radius");
	     // Scanner sc = new Scanner(System.in);
	     radius=sc.nextDouble();
		 area =3.14*radius*radius;
		 System.out.println("Area of cirlce is :"+area);
		
	}
	
	void areaOfTriangle()
	{
		 System.out.println("Enter Base");
	     // Scanner sc = new Scanner(System.in);
	     base=sc.nextDouble();
		 System.out.println("Enter Height");
		 height=sc.nextDouble();
		 area=(base*height)/2;
		 System.out.println("Area of Triangle is :"+area);
	}
	
	void areaOfRectangle()
	{
		 System.out.println("Enter Length"); 
	     length=sc.nextDouble();
		 System.out.println("Enter Breadth");
		 breadth=sc.nextDouble();
		 area=length*breadth;
		 System.out.println("Area of Rectangle is :"+area);
	}
	
	void areaOfSquare()
	{
		 System.out.println("Enter Side");
	     // Scanner sc = new Scanner(System.in);
	     side=sc.nextDouble();
		 area=side*side;
		 System.out.println("Area of Square is :"+area);
	}
		
	public static void main(String args[])
	{
	 Shape s =new Shape();
	 // s.areaOfSquare();  
	 s.areaOfTriangle();
	 }

} 
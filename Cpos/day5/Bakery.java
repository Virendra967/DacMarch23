class Bakery{
   String Name,Product_name;
   int Price,Order_id;
   
   void Display(String Name,int Price,String Product_name,int Order_id)
   {
	 System.out.println(Name);
	 System.out.println(Price);
	 System.out.println(Product_name); 
	 System.out.println(Order_id);
   }
   
   void Purchase()
   {
     System.out.println("Product purchased");
   }
   void Bill()
   {
     System.out.println("Bill generated");
   }
   void BillPayment()
   {
     System.out.println("Bill Payed");
	 System.out.println("Please Visit Again! Thank You");
   }
	public static void main(String args[])
	{
	  Bakery B = new Bakery();
	  Bakery b1= new Bakery();
	  b1.Display("Shivanshu",10000,"Chocolate Cake",1);
	  B.Display("Virendra",1000,"Ice Cream",2);
	  B.Purchase();
	  B.Bill();
	  B.BillPayment();
	}
}
	 
		
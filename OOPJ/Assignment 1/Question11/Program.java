class  Program{
    public static void main(String[] args) {
        System.out.println(args[0].charAt(0));
        char a=args[0].charAt(0);
        if((int)a>=65&&(int)a<=90||(int)a>=97&&(int)a<=122)
        {
            if((int)a>=97&&(int)a<=122)
            {
                System.out.println("The character entered is in lowercase "+a);
                System.out.println("The character in uppercase is "+((char)(a-32)));
            }
            else 
            {
                System.out.println("The character entered is already in Uppercase "+a);
            }
        }
        else if((int)a>=48&&(int)a<=57)
        {
            System.out.println("The digit entered is "+a); 
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    
}

class Program{
    public static void main(String[] args) {
        int num=400;
        String str=String.valueOf(num);
        System.out.println("num = "+num);
        System.out.println("str ="+str);
        Integer num2 = new Integer(str);

        String bin=Integer.toBinaryString(num);
        System.out.println("Binary value of num is "+ bin);
        
        String oct=Integer.toOctalString(num);
        System.out.println("Octal value of num is "+ oct);

        String hex=Integer.toHexString(num);
        System.out.println("Hexadecimal value of num is "+ hex);

 
    }
    
}


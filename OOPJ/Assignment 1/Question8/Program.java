class Program {
    public static void main(String args[]){
        //byte value into String
        byte b = 10;
        String str = String.valueOf(b);
        System.out.println(str);
        // byte value into Byte instance.
        byte a =new Byte(Byte.valueOf(b));
        System.out.println(a);
        //String instance into Byte instance.
        Byte by = new Byte(str);
        System.out.println(str);
    
    }
}

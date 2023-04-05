class Program {
    public static void main(String[] args) {
        Float f=new Float (1234.8);

        byte b=f.byteValue();
        System.out.println(b);
        short sh=f.shortValue();
        System.out.println(sh);
        int n=f.intValue();
        System.out.println(n);
        float f1=f;
        System.out.println(f1);
        double d=f;
        System.out.println(d);
        long l=f.longValue();
        System.out.println(l);
        
        
    }
}

class Program {
    
public static void main(String[] args) {
    Double d= new Double(1234.29834);
    byte b=d.byteValue();
    System.out.println(b);
    short sh=d.shortValue();
    System.out.println(sh);
    int num=d.intValue();
    System.out.println(num);
    long l=d.longValue();
    System.out.println(l);
    float f=d.floatValue();
    System.out.println(f);
    double d2=d;
    System.out.println(d2);
}
}
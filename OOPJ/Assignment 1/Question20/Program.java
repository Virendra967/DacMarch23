public class Program {
    public static void main(String[] args) {
        
    
    long num=78652834;
    String str=String.valueOf(num);
    Long l=new Long(num);
    Long l2=new Long(str);
    String bin=Long.toBinaryString(num);
    String oct=Long.toOctalString(num);
    String hex=Long.toHexString(num);
    
    System.out.println(bin);
    System.out.println(oct);
    System.out.println(hex);
    }
    
}

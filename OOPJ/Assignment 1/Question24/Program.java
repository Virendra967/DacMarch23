class Program {
    public static void main(String[] args) {
        float num=234.9f;
        String str=String.valueOf(num);
        Float f=new Float(num);
        Float f1=new Float(str);
        String str2=Float.toHexString(num);

        System.out.println(num);
        System.out.println(str);
        System.out.println(f);
        System.out.println(f1);
        System.out.println(str2);
    }
}

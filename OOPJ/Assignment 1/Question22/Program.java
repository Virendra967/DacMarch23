public class Program {
    static long  add(long num1,long num2){
    return (num1+num2);

}
    public static void main(String[] args) {
        long num1=10;
        long num2=30;
        if(num1<num2)
        {
            System.out.println(num2+" is greater than "+num1);
        }
        else 
        System.out.println(num1+" is greater than "+num2);

        long result=add(num1,num2);
        System.out.println(result);
        
    }
        
    }
    


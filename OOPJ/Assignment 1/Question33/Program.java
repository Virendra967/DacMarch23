import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Integer num=new Integer(args[0]);
        Integer num2=new Integer(args[1]);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice + - / * ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        char ab=sc.next().charAt(0);
        switch(ab)
        {
   
       case '+':System.out.println("addition is "+(num+num2));
       break;
       case '-':System.out.println("subtraction is "+(num-num2));
       break;
       case '*':System.out.println("multiplication is "+(num*num2));
       break;
       case '/': System.out.println("division is "+(num/num2));  
       break;
       
        }
       }
}

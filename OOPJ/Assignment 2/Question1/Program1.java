import java.util.*;
import java.time.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class Program1 {
 public static void main(String[] args)throws Exception {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter date in dd/MM/yyyy format");



 //String pattern1 ="dd/MM/yyyy";
 String source = sc.nextLine();
 
System.out.println("Enter hr");
int hh=sc.nextInt();

System.out.println("Enter mm");
int mm=sc.nextInt();

System.out.println("Enter ss");
int ss=sc.nextInt();
 SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy" );
 
 //String source = sc.nextLine();
 Date date1 = sdf1.parse( source );
 

 int day1 = date1.getDate();
 int month1 = date1.getMonth() + 1;
 int year1 = date1.getYear() + 1900;
 

 System.out.println(day1+" / "+month1+" / "+year1+" "+hh+":"+mm+":"+ss);
 
     if(hh>11)
     {
        int t=hh-12;
       System.out.println(month1+" / "+day1+" / "+year1+" "+t+":"+mm+":"+ss+" "+"PM");
     }
     else
     {
        System.out.println(month1+" / "+day1+" / "+year1+" "+hh+":"+mm+":"+ss+" "+"AM");
     }

System.out.println(year1+" / "+month1+" / "+day1+" "+hh+":"+mm);
 }
} 

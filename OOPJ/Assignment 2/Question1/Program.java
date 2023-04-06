import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
class Menu{
    Scanner sc = new Scanner(System.in);
    Date d = new Date();

public void menuList() {
    while (true) {
        System.out.println("Menu");
            System.out.println("1.Date format dd/mm/yyyy");
            System.out.println("2.Date Format mm/dd/yyyy");
            System.out.println("3.Date Format yyyy/mm/dd");
            System.out.println("4.Time Format hh:mm:ss");
            System.out.println("5.Time Format hh:mm:ss a");
            System.out.println("6.Time Format hh:mm");
            System.out.println("7.Date & Time Format dd/mm/yyyy hh:mm:ss");
            System.out.println("8.Date & Time Format mm/dd/yyyy hh:mm:ss a");
            System.out.println("9.Date & Time Format yyyy/mm/dd hh:mm");
            System.out.println("Enter Choice");
            int choice = sc.nextInt();
      if (choice == 10) {
        System.out.println("Good Bye See You again");
        break;
      }
      switch(choice)
     {
        case 1:
         d.dateFormat1();
         break;
        case 2:
         d.dateFormat2();
         break;
        case 3:
         d.dateFormat3();
         break;
        case 4:
         d.timeFormat1();
         break;
        case 5:
         d.timeFormat2();
         break;
        case 6:
         d.timeFormat3();
         break;
        case 7:
         d.dateTimeFormat1();
         break;
        case 8:
         d.dateTimeFormat1();
         break;
        case 9:
         d.dateTimeFormat1();
         break;
        
        default:
         System.out.println("Please enter a valid input");
         break;
        }
  }
}
}
class Date{
    LocalDate ld =null;
    Scanner sc = new Scanner(System.in);
    void dateFormat1(){
        System.out.println("Enter Date");
        String input=sc.nextLine();
        ld=LocalDate.parse(input,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
     }
     void dateFormat2(){
 
     }
     void dateFormat3(){
 
     }
     void timeFormat1(){

     }
     void timeFormat2(){
         
     }
     void timeFormat3(){
         
     }
     void dateTimeFormat1(){
         
     }
     void dateTimeFormat2(){
         
     }
     void dateTimeFormat3(){
         
     }
}


class Program{
    public static void main(String[] args) {
        Menu m = new Menu();
        m.menuList();
    }
    
}

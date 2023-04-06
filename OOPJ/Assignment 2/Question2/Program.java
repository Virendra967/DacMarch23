import java.util.Scanner;

class Bmi{
    private double height;
    private double weight; 
Bmi(){

}

public void setWeight(double weight) {
    this.weight = weight;
} 
public void setHeight(double height) {
    this.height = height;
}
public double getHeight() {
    return height;
}
public double getWeight() {
    return weight;
}
}
class BmiTest{
   Bmi bmi =new Bmi();
   Scanner sc = new Scanner(System.in);
   public void acceptRecord(){
      System.out.println("Enter Weight ");
      bmi.setWeight(sc.nextDouble());
      System.out.println("Enter Height ");
      bmi.setHeight(sc.nextDouble());
   }
   public double calculateBmi(){
    Double Bmi =bmi.getWeight()/(bmi.getHeight()*bmi.getHeight());
    return Bmi;
 } 
}
 class Program {
    //driver Program
    public static void main(String[] args) {
    BmiTest b = new BmiTest();
    b.acceptRecord();
    // b.calculateBmi();
    System.out.println(b.calculateBmi());
    }
    
    
}
   

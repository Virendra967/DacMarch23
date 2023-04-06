import java.util.Scanner;
import java.util.Set;
import java.util.jar.Attributes.Name;

class ElectricityBill{
    private String customerName;
    private double unitsConsumed,billAmount;
    ElectricityBill(){
     this.setBillAmount(unitsConsumed);
     this.setCustomerName(customerName);    
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getUnitsConsumed() {
        return unitsConsumed;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public double calculateBillAmount(){
        if(this.unitsConsumed<=100){
            this.billAmount=this.unitsConsumed*5;
            return(this.billAmount);
        }
        else if(this.unitsConsumed>100&&this.unitsConsumed<=200){
            this.billAmount=this.unitsConsumed*7;
            return(this.billAmount);
        }
        else{
            this.billAmount=this.unitsConsumed*10;
            return (this.billAmount);
        }
    }
}
class ElectricityBillTest{
static Scanner sc  = new Scanner(System.in);
ElectricityBill EB =  new ElectricityBill(); 
public void acceptRecord(){
    System.out.println("-------------Electricity Board Of India-------------------");
    System.out.println("Enter The Cusomer Name");
    EB.setCustomerName(sc.nextLine());
    System.out.println("Enter The Units Consumed");
    EB.setUnitsConsumed(sc.nextDouble());
    
}
public void printRecord(){
    System.out.println("-----------------------------------------------------------");
    System.out.println("Customer Name Mr/Mrs-"+EB.getCustomerName());
    System.out.println("Total Units Consumed"+EB.getUnitsConsumed());
    System.out.println("Toatal Bill Amount"+EB.calculateBillAmount());
    System.out.println("-----------------------------------------------------------");
}
}
public class Program {
    public static void main(String[] args) {
    ElectricityBillTest test = new ElectricityBillTest();
    test.acceptRecord();
    test.printRecord();
}
}

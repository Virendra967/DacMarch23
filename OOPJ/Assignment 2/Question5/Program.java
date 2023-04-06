import java.util.Scanner;

class Telephone{
private String customerName;
private double phoneNumber,billAmount;
private int noOFCalls,durationInMin;

Telephone(){

}
public void setCustomerName(String customerName) {
    this.customerName = customerName;
}
public void setPhoneNumber(double phoneNumber) {
    this.phoneNumber = phoneNumber;
}
public void setNoOFCalls(int noOFCalls) {
    this.noOFCalls = noOFCalls;
}
public void setDurationInMin(int durationInMin) {
    this.durationInMin = durationInMin;
}
public void setBillAmount(double billAmount) {
    this.billAmount = billAmount;
}


public String getCustomerName() {
    return customerName;
}
public double getPhoneNumber() {
    return phoneNumber;
}
public int getNoOFCalls() {
    return noOFCalls;
}
public int getDurationInMin() {
    return durationInMin;
}
public double getBillAmount() {
    return billAmount;
}
public void billAmount(){
    double callBeyond=this.noOFCalls-100;
    if(callBeyond>0){
        billAmount+=callBeyond*.25;
    }
    double callBelow=this.noOFCalls-callBeyond;
    if(callBelow>=1 && callBelow<=100){
        billAmount+=callBelow*.5;
    }
    System.out.println("Calling bill is "+billAmount);
    System.out.println("Total bill "+(billAmount+10)+"$");
}   
}
class TelephoneTest{
    Telephone t = new Telephone();
    Scanner sc = new Scanner(System.in);

    void acceptRecord(){
    System.out.println("Enter Customer Name ");
    t.setCustomerName(sc.nextLine());
    System.out.println("Enter Phone no ");
    t.setPhoneNumber(sc.nextDouble());
    System.out.println("Enter Duration ");
    t.setDurationInMin(sc.nextInt());
    System.out.println("Enter No of calls ");
    t.setNoOFCalls(sc.nextInt());
    }
    void printRecord(){
        System.out.println("Name of customer "+t.getCustomerName());
        System.out.println("No of calls by customer "+t.getNoOFCalls());
        System.out.println("Phone number "+t.getPhoneNumber());
        System.out.println("Total duration is "+t.getDurationInMin());
        t.billAmount();
    }
} 
class Program {
    public static void main(String [] args){
    TelephoneTest phone = new TelephoneTest();
    phone.acceptRecord();
    phone.printRecord();

}
}

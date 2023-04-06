import java.util.Scanner;

class Book{
    Scanner sc = new Scanner(System.in);
    //feilds
    private String title,author,publisher,isbn;
    private int quantity,year;
    private Double price; 
    int quantity1;
    Book(){

    }
    //Setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //Getter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public Double getPrice() {
        return price;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getYear() {
        return year;
    }

    //Methods
    public void increaseQuantity(){
     
     System.out.println("Enter quantity to increase");
     quantity1= sc.nextInt();
     int result =getQuantity()+quantity1;
     System.out.println(result);
     
    }
    public void decreaseQuantity(){
        System.out.println("enter quantity to decrease");
        quantity1=sc.nextInt();
        System.out.println(quantity1);
        if(this.quantity>=quantity1){
             quantity1=getQuantity()+quantity1;
        }
        else{
            System.out.println("Nothing available to delete");
        }
    }
    public double inventoryValue(){
        return quantity *price;
    }
}
class bookTest{
    Book b1 =new Book();
    static Scanner sc =new Scanner(System.in);
    void acceptRecord(){
      sc.nextLine();
      System.out.println("Enter Book name");
      b1.setTitle(sc.nextLine());
      System.out.println("Enter Price");
      b1.setPrice(sc.nextDouble());
      sc.nextLine();
      System.out.println("Enter Author");
      b1.setAuthor(sc.nextLine());
      System.out.println("Enter isbn");
      b1.setIsbn(sc.nextLine());
      System.out.println("Enter Publisher");
      b1.setPublisher(sc.nextLine());
      System.out.println("Enter Quantity");
      b1.setQuantity(sc.nextInt());
      System.out.println("Enter Year");
      b1.setYear(sc.nextInt());
      System.out.println("-------------------------------");
    }
    void printRecord(){
        System.out.println("==========================================");
        // System.out.println("Title of the book is "+b1.getTitle());
        // System.out.println("Price of the book is "+b1.getPrice());
        // System.out.println("Author is "+b1.getAuthor());
        // System.out.println("ISBN is "+b1.getIsbn());
        // System.out.println("Publisher is "+b1.getPublisher());
        System.out.println("Quantity of books is "+b1.getQuantity());
        // System.out.println("Published Year "+b1.getYear());
        System.out.println("==========================================");
    }
    public static int menuList( ){
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.println("3.Increase Quantity");
        System.out.println("4.Decrease Quantity");
        System.out.println("5.Inventory details");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
        
      }
}



class Program {
   public static void main(String[] args) {
    // Book b1 = new Book();
    // Scanner sc = new Scanner(System.in);
    bookTest test= new bookTest();
    Book b1 = new Book();
    int choice;
    
    while( ( choice = bookTest.menuList( ) ) != 0 ){
      switch( choice ){
        case 1:
          test.acceptRecord();
          break;
        case 2:
            test.printRecord();
            break;
        case 3:
            b1.increaseQuantity();
            break;
        case 4:
            b1.decreaseQuantity();
            break;
        case 5:
            b1.inventoryValue();
            break;
      }
    }
  }
} 


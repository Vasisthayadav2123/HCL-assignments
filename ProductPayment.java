import java.util.Scanner; 
 
public class ProductPayment{ 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter Customer Name:"); 
        String customerName = scanner.nextLine(); 
 
        System.out.println("Enter Contact No:");         long contact = scanner.nextLong();         scanner.nextLine();  
 
        System.out.println("Enter Product Name:"); 
        String productName = scanner.nextLine(); 
 
        System.out.println("Enter the mode of Payment:\n1.Cash Payment\n2.Wallet Payment\n3.Card Payment");         int paymentMode = scanner.nextInt(); 
 
        Product product = new Product(customerName, contact, productName);         product.DisplayDetails(); 
 
        Payment payment = new Payment(); 
 
        switch (paymentMode) { 	
            case 1: 
                System.out.println("Enter the Amount of Payment:");                 double cashAmount = scanner.nextDouble();                 payment.MakePayment(cashAmount); 
                break;             case 2: 
                scanner.nextLine();  
                System.out.println("Enter the Wallet Number:"); 
                String walletNumber = scanner.nextLine();                 System.out.println("Enter the Amount of Payment:");                 double walletAmount = scanner.nextDouble();                 payment.MakePayment(walletNumber, walletAmount); 
                break;             case 3: 
                scanner.nextLine(); 
                System.out.println("Enter the Credit Card Number:"); 
                String creditCard = scanner.nextLine(); 
                System.out.println("Enter the Validity Date (dd/MM/yyyy):"); 
                String ccv = scanner.nextLine(); 
                System.out.println("Enter the Card Holder Name:"); 
                String cardHolderName = scanner.nextLine();                 System.out.println("Enter the Amount of Payment:");                 double cardAmount = scanner.nextDouble();                 payment.MakePayment(creditCard, ccv, cardHolderName, cardAmount); 
                break;             default: 
                System.out.println("Please select the correct mode of payment..."); 
        } 
 
        scanner.close(); 
    } 
} 
class Product {     private String customerName;     private long contact;     private String productName; 
 
    public Product() {} 
 
    public Product(String customerName, long contact, String productName) {         this.customerName = customerName; 
        this.contact = contact; 
        this.productName = productName; 
    } 
 
    public String getCustomerName() {         return customerName; 
    } 
 
    public void setCustomerName(String customerName) {         this.customerName = customerName; 
    } 
 
    public long getContact() {         return contact; 
    } 
 
    public void setContact(long contact) {         this.contact = contact; 
    } 
 
    public String getProductName() {         return productName; 
    } 
 
    public void setProductName(String productName) {         this.productName = productName; 
    } 
 
    public void DisplayDetails() { 
        System.out.println("Customer Name: " + customerName); 
        System.out.println("Contact No: " + contact); 
        System.out.println("Product Purchased: " + productName); 
    } 
} 
class Payment { 
     
    public void MakePayment(double amount) { 
        System.out.println("You have selected the Cash payment mode"); 
        System.out.printf("Amount Paid Rs.%.2f\n", amount); 
    } 
 
    public void MakePayment(String walletNumber, double amount) { 
        System.out.println("You have selected the Wallet payment mode");         System.out.println("Wallet Number: " + walletNumber); 
        System.out.printf("Amount Paid Rs.%.2f\n", amount); 
    } 
 
    public void MakePayment(String creditCard, String ccv, String name, double amount) { 
        System.out.println("You have selected the Card payment mode"); 
        System.out.println("CreditCard/Debit Card Number: " + creditCard); 
        System.out.println("Card Holder Name: " + name); 
        System.out.printf("Amount Paid Rs.%.2f\n", amount); 
    } 
} 

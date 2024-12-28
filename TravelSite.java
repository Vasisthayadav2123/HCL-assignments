 
     import java.util.Scanner; 
 
     public class TravelSite {     public static void main(String[] args) { 
             Scanner scanner = new Scanner(System.in); 
      
             System.out.println("Enter the travel details"); 
              
             System.out.println("Travel Place: "); 
             String place = scanner.nextLine(); 
      
             System.out.println("Number of tickets: ");         int numberOfTickets = scanner.nextInt(); 
      
             System.out.println("Cost per ticket: ");         double costPerTicket = scanner.nextDouble(); 
      
             System.out.println("1)Travel Creditcard\n2)Reward Creditcard");         System.out.print("Enter credit card type: ");         int cardType = scanner.nextInt(); 
      
             if (cardType == 1) { 
                 System.out.println("1)International\n2)National"); 
                 System.out.println("Enter travel creditcard type: ");             int travelCardType = scanner.nextInt();             scanner.nextLine(); // Consume newline 
      
                 System.out.println("Enter the creditcard number: "); 
                 String cardNumber = scanner.nextLine(); 
      
                 System.out.println("Enter the creditcard holdername: "); 
                 String holderName = scanner.nextLine(); 
      
                 System.out.println("Enter the available amount: ");             double availableAmount = scanner.nextDouble(); 
      
                 if (travelCardType == 1) { 
                     InternationalTravelCreditCard card = new InternationalTravelCreditCard();                 card.setNumber(cardNumber);                 card.setHolderName(holderName);                 card.setAmount(availableAmount); 
      
                     double amountToPay = card.calculateAmount(costPerTicket, numberOfTickets); 
                     System.out.printf("Hello %s, You have to pay Rs%.1f\n", holderName, amountToPay); 
      
                 } else if (travelCardType == 2) { 
                     CountryTravelCreditCard card = new CountryTravelCreditCard();                 card.setNumber(cardNumber);                 card.setHolderName(holderName);                 card.setAmount(availableAmount); 
      
                     double amountToPay = card.calculateAmount(costPerTicket, numberOfTickets);                 System.out.printf("Hello %s, You have to pay Rs%.1f\n", holderName, amountToPay); 
      
                 } else { 
                     System.out.println("Invalid Card Type"); 
                 } 
      
             } else if (cardType == 2) {             scanner.nextLine(); // Consume newline 
      
                 System.out.print("Enter the creditcard number: "); 
                 String cardNumber = scanner.nextLine(); 
      
                 System.out.print("Enter the creditcard holder name: "); 
                 String holderName = scanner.nextLine(); 
      
                 System.out.print("Enter the available amount: ");             double availableAmount = scanner.nextDouble(); 
      
                 System.out.print("Enter the available rewards: ");             double rewards = scanner.nextDouble(); 
      
                 RewardsCreditCard card = new RewardsCreditCard();             card.setNumber(cardNumber);             card.setHolderName(holderName);             card.setAmount(availableAmount);             card.setCreditPoints(rewards); 
      
                 double amountToPay = card.calculateAmount(costPerTicket, numberOfTickets); 
                 System.out.printf("Hello %s, You have to pay Rs%.1f\n", holderName, amountToPay); 
      
             } else { 
                 System.out.println("Invalid Card Type"); 
             } 
      
             scanner.close(); 
         } 
     } 
     class CreditCard {     private String number;     private String holderName;     private double amount; 
      
         public String getNumber() {         return number; 
         } 
      
         public void setNumber(String number) {         this.number = number; 
         } 
      
         public String getHolderName() {         return holderName; 
         } 
      
         public void setHolderName(String holderName) {         this.holderName = holderName; 
         } 
      
         public double getAmount() {         return amount; 
         } 
      
         public void setAmount(double amount) {         this.amount = amount; 
         } 
     } 
     class TravelCreditCard extends CreditCard {     private double exchangePercentage; 
      
         public double getExchangePercentage() {         return exchangePercentage; 
         } 
      
         public void setExchangePercentage(double exchangePercentage) {         this.exchangePercentage = exchangePercentage; 
         } 
     } 
     class RewardsCreditCard extends CreditCard {     private double creditPoints; 
      
         public double getCreditPoints() {         return creditPoints; 
         } 
      
         public void setCreditPoints(double creditPoints) {         this.creditPoints = creditPoints; 
         } 
      
         public double calculateAmount(double amount, int numberOfPersons) {         double discount = amount * 0.05 * numberOfPersons;          return amount * numberOfPersons - discount; 
         } 
     } 
     class InternationalTravelCreditCard extends TravelCreditCard { 
         
         public double calculateAmount(double amount, int numberOfPersons) {         double discount = amount * 0.10 * numberOfPersons;          return amount * numberOfPersons - discount; 
         } 
     } 
     class CountryTravelCreditCard extends TravelCreditCard { 
         
         public double calculateAmount(double amount, int numberOfPersons) {         double discount = amount * 0.10 * numberOfPersons;         return amount * numberOfPersons - discount; 
         } 
     } 
     
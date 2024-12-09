
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter CustomerID:");
        int id=scan.nextInt();
        System.out.println("Enter Your Name:");
        String name;
        name = scan.nextLine();
        System.out.println("Enter unit consumed:");
        int unit=scan.nextInt();
        System.out.println("Electricity Bill");
        System.out.println("Customer ID :"+ id);
        System.out.println("Customer Name :"+ name);
        System.out.println("Unit Consumed :"+ unit);
        double charge;
     if(unit<=199){
     System.out.println("Amount Charges @Rs.1.20 per unit :"+ unit*1.20);
     System.out.println("surcharge Amount: 0 ");
     System.out.println("Net Amount to be paid :"+unit*1.20);
     }
     else if(199<unit && unit<400){
     System.out.println("Amount Charges @Rs.1.50 per unit :"+ unit*1.50);
     if(unit*1.50<400)
        charge=0;
        else{
        charge=(15/100)*(unit*1.50);
        }
        System.out.println("surcharge Amount:"+ charge);
        System.out.println("Net Amount to be paid :"+unit*1.50+charge);
     }
    else if(400<unit&& unit <600 ){
        System.out.println("Amount Charges @Rs.1.80 per unit :"+ unit*1.80);
        charge=(15/100)*(unit*1.80);
        System.out.println("surcharge Amount:"+charge);
        System.out.println("Net Amount to be paid :"+(unit*1.80+charge));

        }
    else{
        System.out.println("Amount Charges @Rs.2.0 per unit :"+ unit*2);
        charge=(15/100)*(unit*2);
        System.out.println("surcharge Amount:"+ charge);
        System.out.println("Net Amount to be paid :"+(unit*2+charge));
    }
    }
}

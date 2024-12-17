import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        
        System.out.println("Enter Age:");
        int age = my.nextInt();
        
        System.out.println("Enter Bill Amount:");
        int bill = my.nextInt();
        
        if (age < 60) {
            System.out.println("Normal User");
            System.out.println("Bill Amount: " + bill);
        } else {
            System.out.println("Senior Citizen");
            float discount = (30 * bill) / 100.0f;
            if (discount < 300) {
                System.out.println("Final Bill Amount: " + (bill - discount));
            } else {
                System.out.println("Final Bill Amount: " + (bill - 300));
            }
        }
        
        my.close();
    }
}



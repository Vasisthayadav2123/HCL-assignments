import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    System.out.println("Select the products from the below list");
    System.out.println("1)Women T-shirts - Rs.469");
    System.out.println("2)Men T-shirts - Rs.469");
    System.out.println("3)Kids T-shirts - Rs.625");
    System.out.println("4)Women Ethnic Wear - Rs.625");
    System.out.println("5)Men Formals - Rs.1000");
    System.out.println("6)Women Western Wear - Rs.899");
    System.out.println("7)Kids Night Suit - Rs.999");
    System.out.println("8)Men Jeans - Rs.625");
    System.out.println("9)Women Sarees - Rs.725");
    System.out.println("10)Girl Skirts - Rs.500");1
    System.out.println("How many products you want to purchase?");
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    int price=0;
    for(int i=0;i<n;i++){
        int item = scan.nextInt();
        switch(item){
            case 1:
                price=price+469;
                break;
            case 2:
                price=price+469;
                break;
            case 3:
                price=price+625;
                break;
            case 4:
                price=price+625;
                break;
            case 5:
                price=price+1000;
                break;
            case 6:
                price=price+899;
                break;
            case 7:
                price=price+999;
                break;
            case 8:
                price=price+625;
                break;
            case 9:
                price=price+725;
                break;
            case 10:
                price=price+500;
                break;
            
        }
    }
    if(price>3000 && price%5==0 && price%10 !=0 && n>=5){
    System.out.println("Congrats! You are eligible for 50% discount");
    System.out.println("Your actual total is :" + price);
    System.out.println("Your total amount after discount is:"+ price/2);
        }
    else{
    System.out.println("better luck next time");
    System.out.println("Your total amount is :"+price);
        }
        
    
    
    }
}

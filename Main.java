public class coupon { 
    private String couponNumber; 
    private double total; 
     
    // Default constructor 
    public coupon() {} 
     
    // Parameterized constructor 
    public coupon(String _couponNumber, double _total) { 
    this.couponNumber = _couponNumber; 
    this.total = _total; 
    } 
     
    // Getters and Setters 
    public String getCouponNumber() { 
    return couponNumber; 
    } 
     
    public void setCouponNumber(String couponNumber) { 
    this.couponNumber = couponNumber; 
    } 
     
    public double getTotal() { 
    return total; 
    } 
     
    public void setTotal(double total) { 
    this.total = total; 
    } 
     
    // Method to process coupon 
    public void CouponProcessing() { 
    double discount = 0.0; 
    String coupon = couponNumber.toLowerCase(); 
     
    // Categories of coupons 
    if (coupon.contains("goldencoupon") || coupon.contains("starcoupon") 
    ||  
    coupon.contains("coupon50") || coupon.contains("luckycoupon")) { 
    discount = 50.0; 
    } else if (coupon.contains("silvercoupon") || 
    coupon.contains("coupon25") ||  
    coupon.contains("lucky25") || coupon.contains("star25")) { 
    discount = 25.0; 
    } 
     
    if (discount > 0) { 
    double discountAmount = (discount / 100) * total; 
    double remainingAmount = total - discountAmount; 
    System.out.println("Congrats!! You got " + (int) discount + "% 
    discount on your total amount."); 
    System.out.println("Remaining amount you have to pay is " + 
    remainingAmount); 
    } else { 
    System.out.println("Sorry, this coupon is invalid."); 
    } 
    } 
    } 
     
    Main.java : 
    package com.hcl.kcc; 
     
    import java.util.Scanner; 
     
    public class Main { 
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
     
    System.out.println("Welcome to Shradha Supermarket :)"); 
    System.out.println("Enter your total amount of purchase"); 
    double totalAmount = sc.nextDouble(); 
    sc.nextLine(); // Consume newline character 
     
    System.out.println("Do you have any coupon?(Y/N)"); 
    String hasCoupon = sc.nextLine().trim(); 
     
    if (hasCoupon.equalsIgnoreCase("Y")) { 
    System.out.println("Enter Coupon Number"); 
    String couponNumber = sc.nextLine(); 
     
    // Create a Coupon object 
    Coupon coupon = new Coupon(couponNumber, totalAmount); 
     
    // Process the coupon 
    coupon.CouponProcessing(); 
    } else { 
    System.out.println("No discount applied. Remaining amount you have to 
    pay is " + totalAmount); 
    } 
     
    sc.close(); 
    } 
    }

public class RawMaterialInfo { 
private String product_Name; 
private String supplier_Id; 
private String supplier_Name; 
private Double price; 
 
// Parameterized Constructor 
public RawMaterialInfo(String product_Name, String supplier_Id, String 
supplier_Name, Double price) { 
this.product_Name = product_Name; 
this.supplier_Id = supplier_Id; 
this.supplier_Name = supplier_Name; 
this.price = price; 
} 
 
// Getters 
public String getProduct_Name() { 
return product_Name; 
} 
 
public String getSupplier_Id() { 
return supplier_Id; 
} 
 
public String getSupplier_Name() { 
return supplier_Name; 
} 
 
public Double getPrice() { 
return price; 
} 
 
// Method to compare prices and finalize the supplier 
public static void comparePrice(RawMaterialInfo r1, RawMaterialInfo 
r2) { 
if (r1.getProduct_Name().equalsIgnoreCase(r2.getProduct_Name())) { 
System.out.println("Both product names are matched"); 
if (r1.getPrice() < r2.getPrice()) { 
System.out.println("Give order to " + r1.getSupplier_Name() + " for "
RawMaterial."); 
} else if (r1.getPrice() > r2.getPrice()) { 
System.out.println("Give order to " + r2.getSupplier_Name() + " for 
RawMaterial."); 
} else { 
System.out.println("Both suppliers offer the same price. You can 
choose either."); 
} 
} else { 
System.out.println("Product names do not match. Cannot compare 
prices."); 
} 
} 
} 
 
 
Main5.java : 
package com.hcl.kcc; 
 
import java.util.Scanner; 
 
public class Main5 { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
 
// Input details for first supplier 
System.out.println("Enter productName"); 
String productName1 = sc.nextLine(); 
System.out.println("Enter SupplierId"); 
String supplierId1 = sc.nextLine(); 
System.out.println("Enter SupplierName"); 
String supplierName1 = sc.nextLine(); 
System.out.println("Enter price"); 
double price1 = sc.nextDouble(); 
sc.nextLine(); // Consume the newline character 
 
// Input details for second supplier 
System.out.println("Enter productName"); 
String productName2 = sc.nextLine(); 
System.out.println("Enter SupplierId"); 
String supplierId2 = sc.nextLine(); 
System.out.println("Enter SupplierName"); 
String supplierName2 = sc.nextLine(); 
System.out.println("Enter price"); 
double price2 = sc.nextDouble(); 
 
// Create RawMaterialInfo objects 
RawMaterialInfo supplier1 = new RawMaterialInfo(productName1, 
supplierId1, supplierName1, price1); 
RawMaterialInfo supplier2 = new RawMaterialInfo(productName2, 
supplierId2, supplierName2, price2); 
 
// Compare prices and finalize the supplier 
RawMaterialInfo.comparePrice(supplier1, supplier2); 
 
sc.close(); 
} 
}
package com.hcl.kcc; 
 
import java.util.ArrayList; 
import java.util.Date; 
import java.util.Scanner; 
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
 
class Driver { 
 
private String name; 
private String licenseId; 
private String issueDate; 
private String expiryDate; 
private int experience; 
// Default constructor 
public Driver() {} 
 
// Argument constructor 
public Driver(String name, String licenseId, String issueDate, String 
expiryDate, int experience) { 
this.name = name; 
this.licenseId = licenseId; 
this.issueDate = issueDate; 
this.expiryDate = expiryDate; 
this.experience = experience; 
} 
// Getters 
public String getName() { 
return name; 
} 
 
public String getLicenseId() { 
return licenseId; 
} 
 
public String getIssueDate() { 
return issueDate; 
} 
 
public String getExpiryDate() { 
return expiryDate; 
} 
 
public int getExperience() { 
return experience; 
} 
// Check eligibility 
public boolean isEligible() 
{ 
try { 
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
Date expiry = sdf.parse(expiryDate); 
Date today = new Date(); 
 
// Calculate date 5 years from today 
Date fiveYearsFromNow = new Date(today.getTime() + (5L * 365 * 24 * 60 
* 60 * 1000)); 
return expiry.after(fiveYearsFromNow) && experience >= 5; 
} catch (ParseException e) { 
e.printStackTrace(); 
return false; 
} 
} 
 
 
public static void main(String[] args) { 
 
Scanner sc = new Scanner(System.in); 
ArrayList<Driver> shortlistedCandidates = new ArrayList<>(); 
String continueInput; 
 
do { 
System.out.println("Enter candidate details:"); 
 
System.out.print("Name: "); 
String name = sc.nextLine(); 
 
System.out.print("Driving license number: "); 
String licenseId = sc.nextLine(); 
 
System.out.print("License issue Date (dd/MM/yyyy): "); 
String issueDate = sc.nextLine(); 
 
System.out.print("License expiry Date (dd/MM/yyyy): "); 
String expiryDate = sc.nextLine(); 
 
System.out.print("Experience: "); 
int experience = sc.nextInt(); 
sc.nextLine(); // Consume newline 
 
// Create Driver object 
Driver driver = new Driver(name, licenseId, issueDate, expiryDate, 
experience); 
 
// Check eligibility and add to shortlisted candidates if eligible 
if (driver.isEligible()) { 
shortlistedCandidates.add(driver); 
} 
 
System.out.print("Do you want to continue (yes/no): "); 
continueInput = sc.nextLine().trim(); 
} while (continueInput.equalsIgnoreCase("yes")); 
 
// Print shortlisted candidates 
System.out.println("Shortlisted Candidates list"); 
System.out.println("S. No Name Driving License Number"); 
int serialNumber = 1; 
for (Driver driver : shortlistedCandidates) 
{ 
System.out.println(serialNumber + ". " + driver.getName() + " " + 
driver.getLicenseId()); 
serialNumber++; 
} 
}
import java.util.Scanner; 
 
public class ShippingIndustry {     public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("Enter the name"); 
        String name = scanner.nextLine(); 
 
        System.out.println("Enter the city"); 
        String city = scanner.nextLine(); 
 
        System.out.println("Enter the number of Ships per day");         int noOfShips = scanner.nextInt(); 
         
        System.out.println("Enter the number of passengers travelling in each Ship");         int noOfPassengers = scanner.nextInt(); 
         
        System.out.println("Enter the number of cargo units shipped in each Ship");         int noOfCargoUnits = scanner.nextInt(); 
 
        CommercialServiceShipping commercialService = new CommercialServiceShipping(name, city, noOfShips, noOfPassengers); 
        CargoServiceTransport cargoService = new CargoServiceTransport(name, city, noOfShips, noOfCargoUnits); 
 
        System.out.println("shipping Details"); 
        System.out.println("Number of passengers travelled/day: " + commercialService.calculatenoOfPassengers()); 
        System.out.println("Number of cargo units shipped/day: " + cargoService.calculatenoOfCargoUnits()); 
 
        scanner.close(); 
    } 
} 
class Transport {     private String name;     private String city;     private int noOfShips; 
 
    public Transport(String name, String city, int noOfShips) {         this.name = name; 
        this.city = city;         this.noOfShips = noOfShips; 
    } 
 
    public String getName() {         return name; 
    } 
 
    public void setName(String name) {         this.name = name; 
    } 
 
    public String getCity() {         return city; 
    } 
 
    public void setCity(String city) {         this.city = city; 
    } 
 
    public int getNoOfShips() {         return noOfShips; 
    } 
 
    public void setNoOfShips(int noOfShips) {         this.noOfShips = noOfShips; 
    } 
} 
class CommercialServiceShipping extends Transport {     private int noOfPassengers; 
 
    public CommercialServiceShipping(String name, String city, int noOfShips, int noOfPassengers) {         super(name, city, noOfShips);         this.noOfPassengers = noOfPassengers; 
    } 
    public int getNoOfPassengers() {         return noOfPassengers; 
    } 
 
    public void setNoOfPassengers(int noOfPassengers) {         this.noOfPassengers = noOfPassengers; 
    } 
    public int calculatenoOfPassengers() {         return getNoOfShips() * noOfPassengers; 
    } 
} 
class CargoServiceTransport extends Transport {     private int noOfCargoUnitsPerShip;     public CargoServiceTransport(String name, String city, int noOfShips, int noOfCargoUnitsPerShip) {         super(name, city, noOfShips);         this.noOfCargoUnitsPerShip = noOfCargoUnitsPerShip; 
    } 
    public int getNoOfCargoUnitsPerShip() {         return noOfCargoUnitsPerShip; 
    } 
 
    public void setNoOfCargoUnitsPerShip(int noOfCargoUnitsPerShip) {         this.noOfCargoUnitsPerShip = noOfCargoUnitsPerShip; 
    } 
    public int calculatenoOfCargoUnits() {         return getNoOfShips() * noOfCargoUnitsPerShip; 
    } 
} 

// Base class Vehicle
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;


    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
}

// Subclass Truck
class Truck extends Vehicle {
   


    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
        
    }


    public void calculateFuelEfficiency(double distanceDriven, double fuelUsed) {
         System.out.println( "Maximum Fuel Efficiency is: "+distanceDriven / fuelUsed); 
    }

  
    public void Distance(int totalDistance) {
        System.out.println("Total Distanced Covered is: "+totalDistance);  
    }

    public void MaxSpeed(int maxSpeed) {
        System.out.println("Maximum Speed is: "+maxSpeed); 
   }
}

// Subclass Car
class Car extends Vehicle {
   


    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
       
    }

    public void calculateFuelEfficiency(double distanceDriven, double fuelUsed) {
        System.out.println( "Maximum Fuel Efficiency is: "+distanceDriven / fuelUsed); 
   }

  
   public void Distance(int totalDistance) {
    System.out.println("Total Distanced Covered is: "+totalDistance);  
}

    public void MaxSpeed(int maxSpeed) {
        System.out.println("Maximum Speed is: "+maxSpeed); 
   }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    

  
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
       
    }
    public void calculateFuelEfficiency(double distanceDriven, double fuelUsed) {
        System.out.println( "Maximum Fuel Efficiency is: "+distanceDriven / fuelUsed); 
   }
   
    public void Distance(int totalDistance) {
        System.out.println("Total Distanced Covered is: "+totalDistance);  
    }

    
    public void MaxSpeed(int maxSpeed) {
         System.out.println("Maximum Speed is: "+maxSpeed); 
    }
}

public class Vehicles {
    public static void main(String[] args) {
        
        Truck truck = new Truck("Ford", "F150", 2022, "Gasoline");
        Car car = new Car("Toyota", "Corolla", 2023, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "Gasoline");

       
        System.out.println("Truck: " + truck.make + " " + truck.model + " " + truck.year + " " + truck.fuelType );
         truck.Distance(1220);
         truck.MaxSpeed(200);
         truck.calculateFuelEfficiency(1220,140.0);
        System.out.println("Car: " + car.make + " " + car.model + " " + car.year + " " + car.fuelType);
        car.Distance(1600);
        car.MaxSpeed(300);
        car.calculateFuelEfficiency(1600,300.0);
        System.out.println("Motorcycle: " + motorcycle.make + " " + motorcycle.model + " " + motorcycle.year + " " + motorcycle.fuelType);
        motorcycle.Distance(2000);
        motorcycle.MaxSpeed(260);
        motorcycle.calculateFuelEfficiency(2000,260.0);
    }
}


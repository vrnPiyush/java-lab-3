
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + ":");
       
    }
}


class Manager extends Employee {
    private int numOfProjects;

    public Manager(String name, String address, double salary, String jobTitle, int numOfProjects) {
        super(name, address, salary, jobTitle);
        this.numOfProjects = numOfProjects;
    }

    public void manageProjects() {
        System.out.println(name + " is managing " + numOfProjects + " projects.");
    }

    public double calculateBonus() {
        return salary * 0.1;
    }
}


class Developer extends Employee {
    private double percentCompletion;

    public Developer(String name, String address, double salary, String jobTitle, double percentCompletion) {
        super(name, address, salary, jobTitle);
        this.percentCompletion = percentCompletion;
    }

    public void performanceCompletion() {
        System.out.println(name + "'s performance completion: " + percentCompletion * 100 + "%");
    }

    public double calculateBonus() {
        return salary * 0.05 * percentCompletion; 
    }
}


class Programmer extends Employee {
    private int numOfHoursWorked;

    public Programmer(String name, String address, double salary, String jobTitle, int numOfHoursWorked) {
        super(name, address, salary, jobTitle);
        this.numOfHoursWorked = numOfHoursWorked;
    }

    public void hoursWorked() {
        System.out.println(name + " worked for " + numOfHoursWorked + " hours.");
    }

    public double calculateBonus() {
        return numOfHoursWorked * 10; 
    }
}


public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Rahul", "Kolkata", 80000, "Manager", 5);
        Developer developer = new Developer("Rohan", "Mumbai", 70000, "Developer", 0.8);
        Programmer programmer = new Programmer("Raman", "Delhi", 60000, "Programmer", 40);


        manager.generatePerformanceReport();
        manager.manageProjects();
        System.out.println("Manager's bonus: $" + manager.calculateBonus());

        developer.generatePerformanceReport();
        developer.performanceCompletion();
        System.out.println("Developer's bonus: $" + developer.calculateBonus());
       
        programmer.generatePerformanceReport();
        programmer.hoursWorked();
        System.out.println("Programmer's bonus: $" + programmer.calculateBonus());
    }
}

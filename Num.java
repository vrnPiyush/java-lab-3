import java.util.Scanner;

public class Num {
    private double number;

   
    public Num(double number) {
        this.number = number;
    }


    public boolean isZero() {
        return number == 0;
    }

   
    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    
    public boolean isOdd() {
        return number % 2 != 0;
    }

   
    public boolean isEven() {
        return number % 2 == 0;
    }


    public boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

   
    public boolean isArmstrong() {
        int temp = (int) number;
        int digits = 0;
        int result = 0;
        int originalNumber = temp;

        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }

        originalNumber = temp;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        return result == temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double userInput = scanner.nextDouble();
        scanner.close();

        Num num = new Num(userInput);
        System.out.println("isZero() : " + num.isZero());
        System.out.println("isPositive() : " + num.isPositive());
        System.out.println("isNegative() : " + num.isNegative());
        System.out.println("isOdd() : " + num.isOdd());
        System.out.println("isEven() : " + num.isEven());
        System.out.println("isPrime() : " + num.isPrime());
        System.out.println("isArmstrong() : " + num.isArmstrong());
    }
}

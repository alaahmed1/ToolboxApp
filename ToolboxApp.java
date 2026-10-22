import java.util.InputMismatchException;
import java.util.Scanner;
public class ToolboxApp{
    static Scanner scanner = new Scanner (System.in);

    static void menue(){
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Even or odd");
        System.out.println("3. Maximum of three numbers");
        System.out.println("4. Factorial of a number");
        System.out.println("5. Sum of numbers");
        System.out.println("6. Triangle of stars");
        System.out.println("7. Prime check");
        System.out.println("8. Reverse a number");
        System.out.println("9. Number pyramid");
        System.out.println("0. Exit");

    }
    
    static void CelsiusToFahrenheit(){
        System.out.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
    }

    static void evenOrOdd(){
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }   

    static void factorial(){
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        long factorial = 1;

        if (number<=15){
            for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Number is too large to calculate factorial.");  
        }
    }   

    static void maximumOfThreeNumbers(){
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum number is: " + max);
    }

    static void sumOfNumbers(){
        int sum = 0;
        boolean ex = true;
        while (ex) {
            System.out.println("Enter numbers to sum (enter 0 to finish): ");
            int number = scanner.nextInt();
            sum += number;
            if (number == 0) {
                ex = false;
            }
        }
        System.out.println("The sum of the entered numbers is: " + sum);
    }

    static void triangleOfStars(){
        System.out.println("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void primeCheck() {
        System.out.println("Enter a number to check if it's prime: ");
        int Prime = scanner.nextInt();
        boolean isPrime = true;
        if (Prime <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(Prime); i++) {
                if (Prime % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(Prime + " is a prime number.");
        } else {
            System.out.println(Prime + " is not a prime number.");
        }
    }

    static void reverseNumber() {
        System.out.println("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number is: " + reversed);
    }
        
    static void numberPyramid() {
        System.out.println("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();// Print leading spaces
        }
    }
    
    
    
    public static void main(String [] args){
        boolean Exit = false;
        //menue();
        int choice = 0;
        do {
        try{
            menue();
            System.out.println("Please enter a number between 0 and 9");
            int n = scanner.nextInt();
            choice = n;
        } catch(InputMismatchException e){
            System.out.println("enter a valid number");
            scanner.nextLine(); // Clear the invalid input
        }
        switch (choice) {            
            case 1:
                CelsiusToFahrenheit();
                break;
            case 2:
                evenOrOdd();
                break;
            case 3:
                maximumOfThreeNumbers();
                break;
            case 4:
                factorial();
                break;
            case 5:
                sumOfNumbers();
                break;
            case 6:
                triangleOfStars();
                break;
           case 7:
                primeCheck();
                break;  
            case 8:
                reverseNumber();
                break;
            case 9:
                numberPyramid();
                break;
            case 0:
                Exit = true;
                System.out.println("Goodbye!");
                break;
            default:
               throw new AssertionError();
        }
        }
        while (Exit == false);

    }
}
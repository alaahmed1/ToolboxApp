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
    
    static public void main(String [] args){
        boolean Exit = false;
        menue();

        do {
        try{
            System.out.println("Please enter a number between 0 and 9");
            int n = scanner.nextInt();
        } catch(InputMismatchException e){
            System.out.println("enter a valid number");
            scanner.nextLine(); // Clear the invalid input
        }
        switch (n) {            
            case 1:
                CelsiusToFahrenheit();
                break;
            //case 0:
               // Exit = true;
                //break;
            //default:
               // throw new AssertionError();
        }
        }
        while (Exit == false);

    }
}
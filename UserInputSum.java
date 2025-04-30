import java.util.Scanner;

public class UserInputSum {
    //Day 2
    //Create a method that returns the sum of 2 integers
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    //Create a method that returns the product of 2 integers
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: "); //Prompt the user for their name
        String user = input.nextLine();

        System.out.print("Enter the first integer: "); //Ask for the first and second integers
        int a = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int b = input.nextInt();
        
        System.out.print("Do you wish to add(1) or multiply(2)?: ");
        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("Hello " + user + ", the sum is " + add(a, b) + "!"); //Greet the user and return the sum
            break;
            case 2:
                System.out.println("Hello " + user + ", the product is " + multiply(a, b) + "!"); //Greet the user and return the product
            break;
            default:
                System.out.println("Invalid input."); //If the user doesn't enter the proper input return this error message
        }

        input.close();
    }
}

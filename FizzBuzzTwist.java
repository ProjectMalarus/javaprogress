import java.util.Scanner;

public class FizzBuzzTwist {
    //Print numbers 1 to n
    public static void printToN(int n){
        int[] array = new int[n];
        int increment = 1;

        for(int i = 0; i < array.length; i++){ //Fill up the array
            array[i] = increment;
            increment++;
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] % 3 == 0 && array[i] % 5 == 0){
                System.out.print("FizzBuzz ");
            } else if(array[i] % 5 == 0){
                System.out.print("Buzz ");
            } else if(array[i] % 3 == 0){
                System.out.print("Fizz ");
            } else if(isPrime(array[i])){
                System.out.print("Prime ");
            } else{
                System.out.print(array[i] + " ");
            }
        }
    }
    //Check if number is prime
    public static boolean isPrime(double n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: "); //Prompt the user to enter the number
        int num = input.nextInt();

        printToN(num); //Print from 1 to n

        input.close();
    }
}

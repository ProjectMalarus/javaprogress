import java.util.Scanner;

public class ArraySearchTool {
    //Create and Populate array
    public static int[] generate(int size, Scanner input){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter number: ");
            int num = input.nextInt();
            array[i] = num;
        }
        return array;
    }

    //Search the array for a target
    public static void searchArray(int[] array, int target){
        boolean found = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                found = true;
                System.out.println(target + " found at index: " +  i);
            }
        }
        if(!found){
            System.out.println(target + " is not within the array of numbers.");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: "); //Ask for array size
        int size = input.nextInt();

        int[] array = generate(size, input); //Create the array
        System.out.print("Enter a number to search for: "); //Prompt for a target number
        int target = input.nextInt();

        searchArray(array, target); //Search for the number

        input.close();
    }
}

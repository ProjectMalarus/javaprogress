public class BasicPractices {
    //Day 1
    /*
    Creating a method that takes in two integers, prints out the larger
    number, and if that number is even or odd.
    */
    public static void printIntegers(int x, int y){

        //Create a new int variable and assign it to the larger number
        int z;
        if(x > y) {z = x;}

        else {z = y;}

        //Print out the larger number
        System.out.println(z + " is the larger number");

        //Determine whether the number is even or odd and print out the result
        if(z % 2 == 0) {System.out.println(z + " is even");}

        else {System.out.println(z + " is odd");}
    }

    public static void main(String[] args) throws Exception {
        printIntegers(4, 3);
    }
}
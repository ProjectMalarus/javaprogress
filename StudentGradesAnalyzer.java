import java.util.Scanner;

public class StudentGradesAnalyzer{
    //Day 3
    //Create method to find the average grade
    public static int findAverageGrade(int[] x){
        int average;
        int total = 0;

        for(int i = 0; i < x.length; i++){
            total += x[i]; //Add grades to get the total
        }

        average = total / x.length; //Divide total by array length to get average

        return average;
    }

    //Loop through the array and print out each grade
    public static void print(int[] x){
        System.out.print("Displaying Class Grades: ");
        for(int i : x){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Create a method that returns the highest grade
    public static int findHighestGrade(int[] x){
        int highest = 0;

        for(int i = 0; i < x.length; i++){
            if(highest < x[i]){highest = x[i];}
        }

        return highest;
    }

    //Create a method to find how many students failed
    public static int totalOfFails(int[] x){
        int fails = 0; //Keep track of the amount of failing grades start at 0
        int checkpoint = 60; //If student grade lower than 60 then it counts as a fail

        for(int i : x){
            if(i < checkpoint){fails += 1;} //Loop through every int in the array and check if they're failing
        }
        return fails;
    }

    //Generate array method
    public static int[] generate(int size, Scanner input){
        int[] grades = new int[size];

        for(int i = 0; i < grades.length; i++){
            System.out.print("Enter student grade: ");
            int x = input.nextInt();
            grades[i] = x;
        }
        return grades;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: "); //Prompt user to enter the size of the array
        int size = input.nextInt();
        if(size <= 0){ //If the user enters an invalid size the program warns them and shuts down
            System.out.println("Array size must be greater than 0. Program exiting.");
            input.close();
            return;
        }

        int[] studentGrades = generate(size, input); //Generate the array

        //Print the grades
        print(studentGrades);

        //Display class average
        System.out.println("The class average is: " + findAverageGrade(studentGrades));

        //Display the highest grade
        System.out.println("The highest grade is: " + findHighestGrade(studentGrades));

        //Display the amount of failing grades
        System.out.println("A total of " + totalOfFails(studentGrades) + " student(s) failed the class.");

        input.close();
    }
}
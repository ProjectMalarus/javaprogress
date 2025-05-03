import java.util.Scanner;

public class StringTransformer {
    //Day 8
    //Manipulating Strings

    //Method to count # of words in a string
    public static int countWords(String str){
        if(str.length() == 0){ //Return 0 if the string length is 0
            return 0;
        }
        int wordCount = 0;
        //IN and OUT States
        //OUT means that a separator is seen
        //IN means that a word is seen
        int state = 0; //initial state is out

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '\\'){
                i++;
                continue;
            }

            if(Character.isLetterOrDigit(str.charAt(i))){ //Check if the character is a letter or digit
                if(state == 0){ //If state is out change it to in
                    wordCount++; //Increment the wordcount
                    state = 1;
                }
            } else { //If it's not a word character
                state = 0;
            }
        }
        return wordCount;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        StringBuilder reverse = new StringBuilder(sentence).reverse();

        System.out.println(sentence); //Print original sentence
        System.out.println(sentence.toUpperCase()); //Print in UPPERCASE
        System.out.println(sentence.toLowerCase()); //Print in lowercase
        System.out.println("Number of words: " + countWords(sentence)); //Return the amount of words in the string
        System.out.println(reverse); //Print out reversed string
        
    }
}
